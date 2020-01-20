package com.exercicio.informatic.service;

import java.util.List;

import com.exercicio.informatic.model.Computer;

public interface IComputerService {

	Computer insert(Computer computer);

	Computer update(Computer computer);

	void delete(Computer computer);

	void delete(int id);

	Computer getById(int id);

	List<Computer> getAll();

}
