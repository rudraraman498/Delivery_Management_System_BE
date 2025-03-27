package com.delivery_express_be.Delivery_Express.model;


import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;

    private Integer customerid;

    private Integer deliverytypeid;

    private String pickupaddress;


    private String destinationaddress;


    private String itemsize;

    private Double weight;

    private Double totalprice;

    private String trackingid;

    private String  orderstatus;

    private String createdat;

    private String updatedat;

    public Order(){}

    public Order(Integer orderid, Integer customerid, Integer deliverytypeid, String pickupaddress, String destinationaddress, String itemsize, Double weight, Double totalPrice, String trackingid, String orderStatus, String  createdat, String  updatedat) {
        this.orderid = orderid;
        this.customerid = customerid;
        this.deliverytypeid = deliverytypeid;
        this.pickupaddress = pickupaddress;
        this.destinationaddress = destinationaddress;
        this.itemsize = itemsize;
        this.weight = weight;
        this.totalprice = totalPrice;
        this.trackingid = trackingid;
        this.orderstatus = orderStatus;
        this.createdat = createdat;
        this.updatedat = updatedat;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public Order(Integer customerid, Integer deliverytypeid, String pickupaddress, String destinationaddress, String itemsize, Double weight, Double totalprice, String trackingid, String orderstatus, String createdat, String updatedat) {
        this.customerid = customerid;
        this.deliverytypeid = deliverytypeid;
        this.pickupaddress = pickupaddress;
        this.destinationaddress = destinationaddress;
        this.itemsize = itemsize;
        this.weight = weight;
        this.totalprice = totalprice;
        this.trackingid = trackingid;
        this.orderstatus = orderstatus;
        this.createdat = createdat;
        this.updatedat = updatedat;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getDeliverytypeid() {
        return deliverytypeid;
    }

    public void setDeliverytypeid(Integer deliverytypeid) {
        this.deliverytypeid = deliverytypeid;
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
        return totalprice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalprice = totalPrice;
    }

    public String getTrackingid() {
        return trackingid;
    }

    public void setTrackingid(String trackingid) {
        this.trackingid = trackingid;
    }

    public String getOrderStatus() {
        return orderstatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderstatus = orderStatus;
    }

    public String  getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String  createdat) {
        this.createdat = createdat;
    }

    public String  getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(String  updatedat) {
        this.updatedat = updatedat;
    }
}

