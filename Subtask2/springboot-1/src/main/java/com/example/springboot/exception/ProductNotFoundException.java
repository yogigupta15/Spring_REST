package com.example.springboot.exception;

public class ProductNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundException(Long id) {
		super("The product with " +  id  + " cannot be found!");
		
	}

}
