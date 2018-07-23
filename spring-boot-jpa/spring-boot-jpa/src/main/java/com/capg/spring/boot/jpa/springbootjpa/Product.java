package com.capg.spring.boot.jpa.springbootjpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Entity
public class Product {
	@Id
private String id;
private String name;
private double price;
public Product(String id, String name, double price, String model) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.model = model;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
private String model;
public Product() {
	
}
}
