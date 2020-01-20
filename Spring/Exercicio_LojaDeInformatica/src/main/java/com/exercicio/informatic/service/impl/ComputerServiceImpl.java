package com.exercicio.informatic.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.exercicio.informatic.model.Computer;
import com.exercicio.informatic.service.IComputerService;

public class ComputerServiceImpl implements IComputerService {
	static List<Computer> computers = new ArrayList<Computer>();
	private static int incr = 0;

	@Override
	public Computer insert(Computer computer) {
		incr++;
		computer.setId(incr);
		this.computers.add(computer);
		return computer;
	}

	@Override
	public Computer update(Computer computer) {
		Computer aux = getById(computer.getId());

		if (aux != null) {
			aux.setName(computer.getName());
			aux.setBrand(computer.getBrand());
		}
		return aux;
	}

	@Override
	public void delete(Computer computer) {
		delete(computer.getId());

	}

	@Override
	public void delete(int id) {
		int posicao = -1;
		for (int i = 0; i < this.computers.size(); i++) {
			if (this.computers.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0)
			this.computers.remove(posicao);

	}

	@Override
	public Computer getById(int id) {
		for (Computer computer : computers) {
			if(computer.getId() == id) {
				return computer;
			}
				
		}
		return null;
		
	}

	@Override
	public List<Computer> getAll() {
		return computers;
		}
	}


