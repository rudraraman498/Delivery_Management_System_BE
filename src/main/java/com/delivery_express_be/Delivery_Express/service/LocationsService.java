package com.delivery_express_be.Delivery_Express.service;

import com.delivery_express_be.Delivery_Express.model.Location;
import com.delivery_express_be.Delivery_Express.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationsService {

    @Autowired
    private LocationsRepository locationsRepository;

    public List<Location> getLocations(){
        return locationsRepository.findAll();
    }
}
