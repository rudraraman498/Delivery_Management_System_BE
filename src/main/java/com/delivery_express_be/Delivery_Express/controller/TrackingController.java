package com.delivery_express_be.Delivery_Express.controller;


import com.delivery_express_be.Delivery_Express.model.Tracking;
import com.delivery_express_be.Delivery_Express.service.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/track")
public class TrackingController {
    @Autowired
    private TrackingService trackingService;

    @GetMapping("/byId")
    public Map<String, String> getTracking(@RequestParam String trackingId){
        Tracking record = trackingService.getTracking(trackingId);
        return Map.of(
                "trackingId",record.getTrackingId(),
                "currentLocation",record.getCurrentLocation(),
                "lastUpdated",record.getLastUpdated()
        );
    }
}
