package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class customers {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "id")
	int id;
	@Column(name = "city")
	public String city;
	@Column(name = "date")
	public String date;
	@Column(name = "email")
	public String email;
	@Column(name = "first_name")
	public String firstName;
	@Column(name = "item")
	public String item;
	@Column(name = "last_name")
	public String lastName;
	@Column(name = "model")
	public Long model;
	@Column(name = "phone")
	public Long phone;
	@Column(name = "selector_control")
	public String selectorControl;
	@Column(name = "street")
	public String street;
	@Column(name = "street2")
	public String street2;
	@Column(name = "zip")
	public Long zip;
}
