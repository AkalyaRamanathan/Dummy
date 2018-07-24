package com.capg.spring.dao;

import java.util.List;

import com.capg.spring.dto.Product;

public interface ProductDao {
	public void addProduct(Product p);
	public List<Product> showProduct();
	public void updateProduct(Product p);
	public void deleteProduct(int productId);
	public Product searchProduct(int productId);

}
