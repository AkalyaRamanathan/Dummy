package com.capg.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="prod_id")
private int productId;
	@Column(name="prod_name")
private String productName;
	@Column(name="prod_price")
private double productPrice;
	@Column(name="prod_brand")
	private String productBrand;
public Product(int productId, String productName, double productPrice, String productBrand) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
	this.productBrand = productBrand;
}
public Product() {
	
}

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public String getProductBrand() {
	return productBrand;
}
public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
			+ ", productBrand=" + productBrand + "]";
}
}
