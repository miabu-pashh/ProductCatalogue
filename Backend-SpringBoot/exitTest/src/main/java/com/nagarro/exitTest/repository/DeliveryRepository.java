package com.nagarro.exitTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.exitTest.model.Delivery;

/**
 * The Interface DeliveryRepository.
 */
@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

}
