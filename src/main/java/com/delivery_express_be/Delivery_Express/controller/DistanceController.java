package com.delivery_express_be.Delivery_Express.controller;

import com.delivery_express_be.Delivery_Express.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DistanceController {

    @Autowired
    private DistanceService distanceService;

    @GetMapping("/getPrice")
    public Map<String, Object> getDistance(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam int packages,
            @RequestParam int number) {

        Double price = distanceService.getPrice(from, to,packages,number);

        if (price == null) {
            return Map.of("error", "price not found for these locations");
        }

        return Map.of(
                "from", from,
                "to", to,
                "price", price,
                "packages", packages,
                "number", number
        );
    }
}

