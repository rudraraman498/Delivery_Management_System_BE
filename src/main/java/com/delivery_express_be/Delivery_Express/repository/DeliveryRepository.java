package com.delivery_express_be.Delivery_Express.repository;


import com.delivery_express_be.Delivery_Express.model.DeliveryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryType, Long> {
    public DeliveryType findByDeliveryType(String delivery_type);
}
