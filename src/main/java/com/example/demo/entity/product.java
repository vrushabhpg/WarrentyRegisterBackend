package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	public String date;
	public String item;
	public long model;
	public String selector_control;
}
