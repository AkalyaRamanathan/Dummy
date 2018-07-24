package com.capg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.capg.spring.dto.Product;

@Repository("productdao")
public class ProductDaoImpl implements ProductDao{
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void addProduct(Product p) {
		entityManager.persist(p);
		
	}

	@Override
	public List<Product> showProduct() {
		
		List<Product> list = new ArrayList<Product>();
		Query q =entityManager.createQuery("from Product");
		list=q.getResultList();
		return list;
	}

	@Override
	public void updateProduct(Product p) {
		entityManager.merge(p);
		
	}

	@Override
	public Product searchProduct(int productId) {
		Product empList =	entityManager.find(Product.class, productId);
//		
		return empList;
	}

	@Override
	public void deleteProduct(int productId) {

		Query queryOne=entityManager.createQuery
				("FROM Product where prod_id=:productId");
		queryOne.setParameter("productId",productId);
		Product empList=(Product) queryOne.getSingleResult();
		//entityManager.detach(empList);
		
		entityManager.remove(empList);
		
	}

}
