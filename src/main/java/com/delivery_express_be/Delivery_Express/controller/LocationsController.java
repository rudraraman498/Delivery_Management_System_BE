package com.delivery_express_be.Delivery_Express.controller;


import com.delivery_express_be.Delivery_Express.model.Location;
import com.delivery_express_be.Delivery_Express.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LocationsController {

    @Autowired
    private LocationsService locationsService;


    @GetMapping("/getLocations")
    public List<Location> getLocations(){
        return locationsService.getLocations();
    }
}
