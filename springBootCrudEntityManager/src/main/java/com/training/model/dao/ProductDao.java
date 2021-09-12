package com.training.model.dao;

import java.util.List;

public interface ProductDao {
	public List<Product> getAllProducts();
	public Product addProduct(Product product);
	public void deleteProduct(int id);
	public void updateProduct(int id, Product product);
	public Product getProductById(int id);
}
