package com.delivery_express_be.Delivery_Express.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "available_locations")
public class Location {

    @Id
    private String id;
    private String full_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return full_name;
    }

    public void setName(String name) {
        this.full_name = name;
    }

    public Location( String name) {
        this.full_name = name;
    }
    public Location(){}
}
