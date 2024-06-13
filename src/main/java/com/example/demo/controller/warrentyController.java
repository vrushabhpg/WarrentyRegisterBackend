package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repositery.customersRepo;
import com.example.demo.Repositery.productRepo;
import com.example.demo.Repositery.userRepo;
import com.example.demo.entity.customers;
import com.example.demo.entity.user;
import com.example.demo.entity.product;

@RestController
@CrossOrigin
public class warrentyController {

	@Autowired
	userRepo userrepo;
	@Autowired
	customersRepo customerrepo;
	@Autowired
	productRepo productrepo;

		@RequestMapping("login/{username}/{password}")
		public int login(@PathVariable String username, @PathVariable String password) {
			if (userrepo.countByUsername(username) != 1)
				return -1;
			user user = userrepo.findByUsername(username);
			if (!password.equals(user.getPassword()))
				return -2;
			if(user.getRole() == 1)
			return 3;
			else return 2;
		}
		
		@RequestMapping("save")
		public customers save(@RequestBody customers user) {
			customers data = customerrepo.save(user);
			product pro = new product();
			pro.setItem(user.getItem());
			pro.setDate(user.getDate());
			pro.setModel(user.getModel());
			pro.setSelector_control(user.getSelectorControl());
			product productData = productrepo.save(pro);
			if(data != null)
			return user;
			return null;
		}
		
		@RequestMapping("Register")
		public user Register(@RequestBody user userdata) {
			user data = userrepo.save(userdata);
			if(data != null)
			return userdata;
			return null;
		}
		
		
		@RequestMapping("getalldata")
		public List<customers> getalldata() {
	
		 List<customers> allCustomers = customerrepo.findAll();
		 return allCustomers;
		
		}
}

