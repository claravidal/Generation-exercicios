package com.exercise.beautyShop.service;

import java.util.List;

import com.exercise.beautyShop.model.Fragrance;


public interface IFragranceService {
	Fragrance insert(Fragrance fragrance);

	Fragrance update(Fragrance fragrance);

	void delete(Fragrance fragrance);

	void delete(int id);

	Fragrance getById(int id);

	List<Fragrance> getAll();
}
