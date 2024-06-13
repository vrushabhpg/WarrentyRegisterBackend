package com.example.demo.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.user;

public interface userRepo extends JpaRepository<user,Integer>{

	int countByUsername(String username);

	user findByUsername(String username);
}
