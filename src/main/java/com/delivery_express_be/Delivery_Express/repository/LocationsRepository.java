package com.delivery_express_be.Delivery_Express.repository;

import com.delivery_express_be.Delivery_Express.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsRepository extends JpaRepository<Location, Long> {
}
