package com.training.model.service;

import java.util.List;

import com.training.model.repo.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product addProduct(Product product);
	public void deleteProduct(int product);
	public void updateProduct(int id, Product product);
	public Product getProductById(int id);
}
