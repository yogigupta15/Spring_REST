package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.example.springboot.model.Product;
import com.example.springboot.repository.ProductRepository;

@SpringBootApplication
@EnableCaching
public class Springboot1Application implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		productRepository.save(new Product("Television","Electronics"));
		productRepository.save(new Product("Air Conditioner","Electronics"));
		productRepository.save(new Product("Sofa","Furniture"));
		productRepository.save(new Product("Cushions","Home Essentials"));
		productRepository.save(new Product("Wardrobe","Furniture"));
	}

}
