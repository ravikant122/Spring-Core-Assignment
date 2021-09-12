package com.training.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	private EntityManager em;

	@Autowired
	public ProductDaoImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Product> getAllProducts() {
		return em.createQuery("select p from Product p", Product.class).getResultList();
	}

	@Override
	public Product addProduct(Product product) {
		em.persist(product);
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		Product product=getProductById(id);
		em.remove(product);
	}

	@Override
	public void updateProduct(int id, Product product) {
		Product productToUpdate=getProductById(id);
		productToUpdate.setProductPrice(product.getProductPrice()+100);
		em.merge(productToUpdate);

	}

	@Override
	public Product getProductById(int id) {
		Product product=em.find(Product.class, id);
		if(product==null)
			throw new ProductNotFoundException("product with id "+ id +" is not found");
		
		return product;
	}

}
