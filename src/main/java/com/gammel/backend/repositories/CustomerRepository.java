package com.gammel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gammel.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
