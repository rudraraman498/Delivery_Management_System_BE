package com.delivery_express_be.Delivery_Express.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Map;


@Entity
@Table(name = "delivery_types")
public class DeliveryType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "delivery_type")
    private String deliveryType;
    private String delivery_rate;
    private int max_dlvry_days;


    public DeliveryType(){}
    public DeliveryType(Long id, String delivery_type, String delivery_rate) {
        this.id = id;
        this.deliveryType = delivery_type;
        this.delivery_rate = delivery_rate;
    }

    public DeliveryType(Long id, String delivery_type, String delivery_rate, int max_dlvry_days) {
        this.id = id;
        this.deliveryType = delivery_type;
        this.delivery_rate = delivery_rate;
        this.max_dlvry_days = max_dlvry_days;
    }

    public int getMax_dlvry_days() {
        return max_dlvry_days;
    }

    public void setMax_dlvry_days(int max_dlvry_days) {
        this.max_dlvry_days = max_dlvry_days;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDelivery_type() {
        return deliveryType;
    }

    public void setDelivery_type(String delivery_type) {
        this.deliveryType = delivery_type;
    }

    public Double getDelivery_rate() {
        return Double.parseDouble(delivery_rate);
    }

    public void setDelivery_rate(String delivery_rate) {
        this.delivery_rate = delivery_rate;
    }
}
