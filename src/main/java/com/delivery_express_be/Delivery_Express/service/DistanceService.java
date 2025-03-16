package com.delivery_express_be.Delivery_Express.service;


import com.delivery_express_be.Delivery_Express.model.Distance;
import com.delivery_express_be.Delivery_Express.repository.DistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

