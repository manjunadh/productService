package com.marks.microservices.productService.dao;

import org.springframework.data.repository.CrudRepository;

import com.marks.microservices.productService.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
