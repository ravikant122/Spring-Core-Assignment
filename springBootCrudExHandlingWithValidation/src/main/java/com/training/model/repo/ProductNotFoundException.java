package com.training.model.repo;

public class ProductNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 7871462509199283242L;

	public ProductNotFoundException(String message) {
		super(message);
	}
}
