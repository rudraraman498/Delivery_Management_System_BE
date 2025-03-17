package com.delivery_express_be.Delivery_Express.model;

public class DeliveryRateResponseDTO {
    private String delivery_type;
    private String delivery_rate;
    private String delivery_date;
    private String start_date;

    public DeliveryRateResponseDTO(String delivery_type, String  delivery_rate, String delivery_date, String start_date) {
        this.delivery_type = delivery_type;
        this.delivery_rate = delivery_rate;
        this.delivery_date = delivery_date;
        this.start_date = start_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getDelivery_type() {
        return delivery_type;
    }

    public void setDelivery_type(String delivery_type) {
        this.delivery_type = delivery_type;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getDelivery_rate() {
        return delivery_rate;
    }

    public void setDelivery_rate(String delivery_rate) {
        this.delivery_rate = delivery_rate;
    }
}
