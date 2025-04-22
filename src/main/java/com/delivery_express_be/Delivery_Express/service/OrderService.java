package com.delivery_express_be.Delivery_Express.service;

import com.delivery_express_be.Delivery_Express.model.DeliveryType;
import com.delivery_express_be.Delivery_Express.model.Order;
import com.delivery_express_be.Delivery_Express.model.OrderRequest;
import com.delivery_express_be.Delivery_Express.model.Tracking;
import com.delivery_express_be.Delivery_Express.repository.DeliveryRepository;
import com.delivery_express_be.Delivery_Express.repository.OrderRepository;
import com.delivery_express_be.Delivery_Express.repository.TrackingRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    DeliveryRepository deliveryRepository;

    @Autowired
    TrackingRepository trackingRepository;

    public Tracking saveNewOrder(OrderRequest orderRequest){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String trackingid = uuid.substring(0, 12);
        DeliveryType deliveryType = deliveryRepository.findByDeliveryType(orderRequest.getDeliverytype());
        Integer deliverytypeid =  deliveryType.getId().intValue();
        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Order order = new Order(orderRequest.getCustomerid(),deliverytypeid,orderRequest.getPickupaddress(),orderRequest.getDestinationaddress(),orderRequest.getItemsize(),orderRequest.getWeight(),orderRequest.getTotalPrice(),trackingid,"pending","","");
        orderRepository.save(order);
        Tracking tracking = new Tracking(trackingid,order.getOrderid(),3,"To be picked",formatted);
        trackingRepository.save(tracking);
        return tracking;
    }

    public List<Order> getCustomerOrders(Integer customerID){
        return orderRepository.findByCustomerid(customerID);
    }
    public List<Order> getAllDeliveries(){
        return orderRepository.findAll();
    }
}
