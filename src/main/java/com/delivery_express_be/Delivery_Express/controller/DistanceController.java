package com.delivery_express_be.Delivery_Express.controller;

import com.delivery_express_be.Delivery_Express.model.DeliveryRateResponseDTO;
import com.delivery_express_be.Delivery_Express.model.DeliveryType;
import com.delivery_express_be.Delivery_Express.model.Location;
import com.delivery_express_be.Delivery_Express.repository.LocationsRepository;
import com.delivery_express_be.Delivery_Express.service.DistanceService;
import com.delivery_express_be.Delivery_Express.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DistanceController {

    @Autowired
    private DistanceService distanceService;

    @GetMapping("/getDeliveries")
    public List<DeliveryRateResponseDTO> getDeliveries(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam int packages,
            @RequestParam int number) {

        Double price = distanceService.getPrice(from, to,packages,number);

        Map<String,List<String>> Deliveries = distanceService.getDeliveryPrices(from,to,packages,number);


        List<DeliveryRateResponseDTO> response;
        response = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry : Deliveries.entrySet()){
            List<String> values = entry.getValue();
            response.add(new DeliveryRateResponseDTO(entry.getKey(), values.get(0), values.get(1),values.get(2)));
        }
        return response;
    }
}

