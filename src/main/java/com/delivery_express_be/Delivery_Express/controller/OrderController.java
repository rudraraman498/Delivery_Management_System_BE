package com.delivery_express_be.Delivery_Express.controller;


import com.delivery_express_be.Delivery_Express.model.OrderRequest;
import com.delivery_express_be.Delivery_Express.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @CrossOrigin
    @PostMapping("/new")
    public ResponseEntity<?> newOrder(@RequestBody OrderRequest orderRequest){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderService.saveNewOrder(orderRequest));
    }

    @GetMapping("/customer")
    public ResponseEntity<?> customerOrders(@RequestParam Integer customerID){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderService.getCustomerOrders(customerID));
    }
}
