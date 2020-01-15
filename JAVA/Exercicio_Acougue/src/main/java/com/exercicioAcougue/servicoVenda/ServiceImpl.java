package com.exercicioAcougue.servicoVenda;

import com.exercicioAcougue.baseDados.BaseDadosCarne;
import com.exercicioAcougue.model.Carne;

public class ServiceImpl implements IService {

	BaseDadosCarne baseDados = new BaseDadosCarne();

	public void getAllCarne() {
		for(int i = 0; i< baseDados.getAllCarne().size(); i++) {
		System.out.println("Carne de: " + baseDados.getAllCarne().get(i).getName()+
							"\nQuantidade: " + baseDados.getAllCarne().get(i).getTotal()+
							"\nPreço/Kg: " + baseDados.getAllCarne().get(i).getPrice()+"\n");
	}
		}

	public void addCarne(Carne carne) {
		baseDados.getAllCarne().add(carne);

	}

	public void removeCarne() {
	baseDados.getAllCarne().remove(baseDados.getAllCarne().size()-1);

	}

}
