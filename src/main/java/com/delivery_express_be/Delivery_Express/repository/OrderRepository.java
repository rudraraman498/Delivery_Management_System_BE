package com.delivery_express_be.Delivery_Express.repository;

import com.delivery_express_be.Delivery_Express.model.Order;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
