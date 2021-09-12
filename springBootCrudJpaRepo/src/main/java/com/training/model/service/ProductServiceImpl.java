package com.training.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.model.repo.Product;
import com.training.model.repo.ProductNotFoundException;
import com.training.model.repo.ProductRepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	private ProductRepo productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepo bookRepo) {
		this.productRepo = bookRepo;
	}
	
	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		Product productToDelete=getProductById(id);
		productRepo.delete(productToDelete);
	}

	@Override
	public void updateProduct(int id, Product product) {
		Product productToUpdate= getProductById(id);
		productToUpdate.setProductPrice(product.getProductPrice());
		productRepo.save(productToUpdate);
	}

	@Override
	public Product getProductById(int id) {
		return productRepo.findById((int)id).orElseThrow
				(()-> new ProductNotFoundException("book with id "+ id +" is not found"));
	}

}
