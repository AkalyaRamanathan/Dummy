package com.capg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.spring.dao.ProductDao;
import com.capg.spring.dto.Product;
@Service("productservice")
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productdao;
	@Override
	public void addProduct(Product p) {
	
		productdao.addProduct(p);
		
	}

	@Override
	public List<Product> showProduct() {
		
		return productdao.showProduct();
	}

	@Override
	public void updateProduct(Product p) {
		
		productdao.updateProduct(p);
		
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		productdao.deleteProduct(productId);
		
	}

}
