package com.marks.microservices.productService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marks.microservices.productService.model.Product;
import com.marks.microservices.productService.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String home() {
		return "home page";
	}

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return "product with id" + product.getId() + "added successfully";

	}

	@RequestMapping("/deleteProduct/{id}")
	public String deteleProduct(@RequestParam String id) {
		productService.deleteProduct(id);
		return "product with id " + id + "is deleted";
	}

}
