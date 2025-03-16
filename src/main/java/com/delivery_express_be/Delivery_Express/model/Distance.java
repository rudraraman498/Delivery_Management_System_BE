package com.delivery_express_be.Delivery_Express.model;

import jakarta.persistence.*;
import java.lang.*;

@Entity
@Table(name = "distance_table")
public class Distance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placeFrom;
    private String placeTo;
    private Double distance;

    public Distance() {}

    public Distance(String placeFrom, String placeTo, Double distance) {
        this.placeFrom = placeFrom;
        this.placeTo = placeTo;
        this.distance = distance;
    }

    public Long getId() { return id; }
    public String getPlaceFrom() { return placeFrom; }
    public String getPlaceTo() { return placeTo; }
    public Double getDistance() { return distance; }

    public void setId(Long id) { this.id = id; }
    public void setPlaceFrom(String placeFrom) { this.placeFrom = placeFrom; }
    public void setPlaceTo(String placeTo) { this.placeTo = placeTo; }
    public void setDistance(Double distance) { this.distance = distance; }
}
