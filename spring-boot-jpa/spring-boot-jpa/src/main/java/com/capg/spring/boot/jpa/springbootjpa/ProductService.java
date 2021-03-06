package com.capg.spring.boot.jpa.springbootjpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	IProductRepository productRepo;
	public List<Product> getAllProducts()
	{
		List<Product>products=new ArrayList<>();
		productRepo.findAll().forEach(products::add);
		return products;
		
	}
		
public Optional<Product> getProduct(String id){
	return productRepo.findById(id);
}
public void addProduct(Product p) {
	productRepo.save(p);
}
public void updateProduct(Product p, String id) {
	productRepo.save(p);
}

public void deleteProduct(String id) {
	productRepo.deleteById(id);
}
}
