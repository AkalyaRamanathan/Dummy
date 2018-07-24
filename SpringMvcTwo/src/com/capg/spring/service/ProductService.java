package com.capg.spring.service;

import java.util.List;

import com.capg.spring.dto.Product;



public interface ProductService {

	public void addProduct(Product p);
	public List<Product> showProduct();
	public void updateProduct(Product p);
	public Product searchProduct(int productId);
	public void deleteProduct(int productId);

}
