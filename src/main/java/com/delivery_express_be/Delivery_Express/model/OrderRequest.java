package com.delivery_express_be.Delivery_Express.model;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class OrderRequest {
    private Integer customerid;

    private String pickupaddress;

    private String destinationaddress;

    private String itemsize;

    private Double weight;

    private Double totalPrice;

    private String deliverytype;

    public String getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(String deliverytype) {
        this.deliverytype = deliverytype;
    }

    public OrderRequest(Integer customerid, String pickupaddress, String destinationaddress, String itemsize, Double weight, Double totalPrice, String deliverytype) {
        this.customerid = customerid;
        this.pickupaddress = pickupaddress;
        this.destinationaddress = destinationaddress;
        this.itemsize = itemsize;
        this.weight = weight;
        this.totalPrice = totalPrice;
        this.deliverytype = deliverytype;
    }

    private int deliverytypeid;

    public OrderRequest(Integer customerid, String pickupaddress, String destinationaddress, String itemsize, Double weight, Double totalPrice) {
        this.customerid = customerid;
        this.pickupaddress = pickupaddress;
        this.destinationaddress = destinationaddress;
        this.itemsize = itemsize;
        this.weight = weight;
        this.totalPrice = totalPrice;
    }


    public int getDeliverytypeid() {
        return deliverytypeid;
    }

    public void setDeliverytypeid(int deliverytypeid) {
        this.deliverytypeid = deliverytypeid;
    }
    public OrderRequest(){}
    public OrderRequest(Integer customerid, String pickupaddress, String destinationaddress, String itemsize, Double weight, Double totalPrice, int deliverytypeid) {
        this.customerid = customerid;
        this.pickupaddress = pickupaddress;
        this.destinationaddress = destinationaddress;
        this.itemsize = itemsize;
        this.weight = weight;
        this.totalPrice = totalPrice;
        this.deliverytypeid = deliverytypeid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getPickupaddress() {
        return pickupaddress;
    }

    public void setPickupaddress(String pickupaddress) {
        this.pickupaddress = pickupaddress;
    }

    public String getDestinationaddress() {
        return destinationaddress;
    }

    public void setDestinationaddress(String destinationaddress) {
        this.destinationaddress = destinationaddress;
    }

    public String getItemsize() {
        return itemsize;
    }

    public void setItemsize(String itemsize) {
        this.itemsize = itemsize;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
