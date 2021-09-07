package com.one2one;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="animal_table")
public class Animal implements Serializable{
	private static final long serialVersionUID = 2130451322804986601L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animal_id;
	private String type;
	private Integer total_no;
	
	@OneToOne(mappedBy="animal")
	@JoinColumn(name="cage_id")
	private Cage cage;

	public Animal() {
		super();
	}

	public Animal(String type, Integer total_no) {
		super();
		this.type = type;
		this.total_no = total_no;
	}

	public Animal(Integer animal_id, String type, Integer total_no) {
		super();
		this.animal_id = animal_id;
		this.type = type;
		this.total_no = total_no;
	}

	public Integer getAnimal_id() {
		return animal_id;
	}

	public void setAnimal_id(Integer animal_id) {
		this.animal_id = animal_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTotal_no() {
		return total_no;
	}

	public void setTotal_no(Integer total_no) {
		this.total_no = total_no;
	}

	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [animal_id=");
		builder.append(animal_id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", total_no=");
		builder.append(total_no);
		builder.append(", cage=");
		builder.append(cage);
		builder.append("]");
		return builder.toString();
	}
	
	
}
