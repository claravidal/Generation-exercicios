package com.exercicioAcougue.baseDados;

import java.util.ArrayList;
import java.util.List;
import com.exercicioAcougue.model.Carne;

public class BaseDadosCarne {
	
	List <Carne> listaCarne = new ArrayList<Carne>();

	public BaseDadosCarne() {
	listaCarne.add(new Carne("Porco", 22, 15.00));
	listaCarne.add(new Carne("Frango",33, 16.00));
	listaCarne.add(new Carne("Picanha",5, 33.00));
	
	
	
	}

	public BaseDadosCarne(List<Carne> listaCarne) {
		super();
		this.listaCarne = listaCarne;
	}

	public List<Carne> getAllCarne() {
		return listaCarne;
	}

	public void setListaCarne(List<Carne> listaCarne) {
		this.listaCarne = listaCarne;
	}
	

	

}
