package com.one2many;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category_table")
public class Category implements Serializable {
	private static final long serialVersionUID = -9177968896095830274L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer category_id;
	private String category_no;
	
	@OneToMany(mappedBy="category")
	private List<Animal> animalList=new ArrayList<>();

	public Category() {
		super();
	}

	public Category(String category_no) {
		super();
		this.category_no = category_no;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getCategory_no() {
		return category_no;
	}

	public void setCategory_no(String category_no) {
		this.category_no = category_no;
	}
	
	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [category_id=");
		builder.append(category_id);
		builder.append(", category_no=");
		builder.append(category_no);
		builder.append(", animalList=");
		builder.append(animalList);
		builder.append("]");
		return builder.toString();
	}

	
}
