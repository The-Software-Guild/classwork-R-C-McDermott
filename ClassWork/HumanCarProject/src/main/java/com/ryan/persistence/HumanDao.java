package com.ryan.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ryan.entity.Human;

@Repository
public interface HumanDao extends JpaRepository<Human, String> {

}
