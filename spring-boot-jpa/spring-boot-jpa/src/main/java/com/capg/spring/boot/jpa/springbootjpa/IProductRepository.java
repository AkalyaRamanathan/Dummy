package com.capg.spring.boot.jpa.springbootjpa;

import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, String > {

}
