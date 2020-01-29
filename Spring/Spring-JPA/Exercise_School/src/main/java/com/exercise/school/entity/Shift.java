package com.exercise.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shift {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idShift;
	@Column(length = 100)
	private String name;
	
	public int getIdShift() {
		return idShift;
	}
	public void setIdShift(int idShift) {
		this.idShift = idShift;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
