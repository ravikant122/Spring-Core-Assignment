package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.repo.Product;
import com.training.model.service.ProductService;

@RestController
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService bookService) {
		this.productService = bookService;
	}
	
	@GetMapping(path = "product")
	public List<Product> getAllProduct(){
		return productService.getAllProducts();
	}
	
	@GetMapping(path = "product/{id}")
	public Product getAnProduct(@PathVariable( name = "id")int id){
		return productService.getProductById(id);
	}
	
	@PostMapping(path = "product")
	public Product addProduct(@RequestBody  Product product) {
		return productService.addProduct(product);
	}
	
	@DeleteMapping(path = "product/{id}")
	public void deleteAnBook(@PathVariable( name = "id")int id){
		productService.deleteProduct(id);
	}
	
	@PutMapping(path = "product/{id}")
	public void updateBook(@PathVariable( name = "id")int id, @RequestBody  Product product) {
		productService.updateProduct(id, product);
	}
	
}
