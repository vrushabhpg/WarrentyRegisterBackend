package com.example.demo.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.customers;

public interface customersRepo extends JpaRepository<customers, Integer> {
	
}
