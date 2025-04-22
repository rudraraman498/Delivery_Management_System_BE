package com.delivery_express_be.Delivery_Express.service;


import com.delivery_express_be.Delivery_Express.model.Tracking;
import com.delivery_express_be.Delivery_Express.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TrackingService {

    @Autowired
    private TrackingRepository trackingRepository;

    public Tracking getTracking(String trackingId){
        Tracking record = trackingRepository.getReferenceById(trackingId);
        return record;
    }

}
