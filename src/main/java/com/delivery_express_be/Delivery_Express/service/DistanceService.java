package com.delivery_express_be.Delivery_Express.service;


import com.delivery_express_be.Delivery_Express.model.DeliveryType;
import com.delivery_express_be.Delivery_Express.model.Distance;
import com.delivery_express_be.Delivery_Express.repository.DeliveryRepository;
import com.delivery_express_be.Delivery_Express.repository.DistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

@Service
public class DistanceService {

    @Autowired
    private DistanceRepository distanceRepository;

    public Double getDistance(String from, String to) {
        Distance distance = distanceRepository.findByPlaceFromAndPlaceTo(from, to);
        return distance != null ? distance.getDistance() : -1;
    }
    public Double getPrice(String from, String to, int packages, int number){
        double distance = getDistance(from,to);
        double price = distance * 12.3 * packages * number;
        return distance!=-1?price:null;
    }

    @Autowired
    private DeliveryRepository deliveryRepository;
    public List<DeliveryType> getAllDeliveryTypes(){
        return deliveryRepository.findAll();
    }

    public List<DeliveryType> getAllDeliveries(){
        List<DeliveryType> allDeliveries;
        allDeliveries = this.getAllDeliveryTypes();
        return allDeliveries;
    }

    public Map<String,List<String>> getDeliveryPrices(String from, String to,int packages,int number){
        List<DeliveryType> allDeliveries;
        allDeliveries = this.getAllDeliveryTypes();
        Double distance = getDistance(from, to);
        Map<String , List<String>> deliveryPrices = new HashMap<>();
        for (DeliveryType dt : allDeliveries){
            Double rate = dt.getDelivery_rate();
            Double finalRate = rate * distance * packages * number;
            List<String> delList = new ArrayList<>();
            String strfinalRate = String.valueOf(finalRate);

            int daysToAdd = dt.getMax_dlvry_days();
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));
            ZonedDateTime startDate = now.toLocalTime().isAfter(LocalTime.of(18, 0))
                    ? now.plusDays(1)  // Start from tomorrow
                    : now;             // Start from today

            ZonedDateTime futureDate = startDate.plusDays(daysToAdd);

            String strDeliveryDate = String.valueOf(futureDate);

            delList.add(strfinalRate);
            delList.add(strDeliveryDate);
            delList.add(String.valueOf(now));
            deliveryPrices.put(dt.getDelivery_type(),delList);
        }
        return deliveryPrices;
    }
}

