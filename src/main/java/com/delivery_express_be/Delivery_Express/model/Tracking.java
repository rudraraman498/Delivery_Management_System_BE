package com.delivery_express_be.Delivery_Express.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tracking")
public class Tracking {

    @Id
    @Column(name = "trackingid")
    private String  trackingid;
    @Column(name = "orderid")
    private int orderid;
    @Column(name = "driverid")
    private int driverid;
    @Column(name = "currentlocation")
    private String currentlocation;
    @Column(name = "lastupdated")
    private String lastupdated;

    public Tracking(){}

    public Tracking(String  trackingId, int orderId, int driverId, String currentLocation, String lastUpdated) {
        trackingid = trackingId;
        orderid = orderId;
        driverid = driverId;
        currentlocation = currentLocation;
        lastupdated = lastUpdated;
    }

    public String  getTrackingId() {
        return trackingid;
    }

    public void setTrackingId(String trackingId) {
        trackingid = trackingId;
    }

    public int getOrderId() {
        return orderid;
    }

    public void setOrderId(int orderId) {
        orderid = orderId;
    }

    public int getDriverId() {
        return driverid;
    }

    public void setDriverId(int driverId) {
        driverid = driverId;
    }

    public String getCurrentLocation() {
        return currentlocation;
    }

    public void setCurrentLocation(String currentLocation) {
        currentlocation = currentLocation;
    }

    public String getLastUpdated() {
        return lastupdated;
    }

    public void setLastUpdated(String lastUpdated) {
        lastupdated = lastUpdated;
    }
}
