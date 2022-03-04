package com.ryan.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ryan.entity.Car;

@Repository
public interface CarDao extends JpaRepository<Car, String> {

}
