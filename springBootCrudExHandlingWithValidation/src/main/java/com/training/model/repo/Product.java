package com.training.model.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "prod_table")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	
	@Size(min=100,message="min price is 100")
	private Double productPrice;
	private Double productDiscount;
	private String productCategory;
	private Long productQuantity;
	
	public Product(String productName, Double productPrice, Double productDiscount, String productCategory,
			Long productQuantity) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}
	
	
}
