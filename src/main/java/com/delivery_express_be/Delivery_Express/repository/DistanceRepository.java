package com.delivery_express_be.Delivery_Express.repository;


import com.delivery_express_be.Delivery_Express.model.Distance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistanceRepository extends JpaRepository<Distance, Long> {
    Distance findByPlaceFromAndPlaceTo(String placeFrom, String placeTo);
}
