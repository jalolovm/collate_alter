package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoupleRepo extends JpaRepository<Couple, String> {
    Couple getByCoupleLeft(String coupleLeft);
    Couple getByCoupleRight(String coupleRight);
}
