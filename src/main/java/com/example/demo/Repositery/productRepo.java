package com.example.demo.Repositery;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.product;
import com.example.demo.entity.user;

public interface productRepo extends JpaRepository<product, Integer>{

}
