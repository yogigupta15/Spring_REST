package com.example.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Product;
import com.example.springboot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		
/*		return Arrays.asList(
				new Product("P101","Monitor","Electronics"),
				new Product("P102","Blanket","Household"),
				new Product("P103","Laptop","Electronics"),
				new Product("P104","Shirt","Fashion"),
				new Product("P105","Pens","School"));	*/
		
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{pId}")
	public Product getproduct(@PathVariable("pId") String id) {
		return productService.getProduct(id);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/products/{pId}")
	public void upadateProduct(@RequestBody Product product, @PathVariable("pId") String id) {
		productService.updateProduct(id, product);
	}
	@DeleteMapping("/products/{pId}")
	public void deleteProduct(@PathVariable("pId") String id) {
		productService.deleteProduct(id);
	}
	
}
