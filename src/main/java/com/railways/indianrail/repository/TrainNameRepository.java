package com.railways.indianrail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railways.indianrail.entity.TrainName;

/**
 * 
 * @author rishabh
 *
 */
public interface TrainNameRepository extends JpaRepository<TrainName, Integer> {
}
