package com.exercise.beautyShop.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.exercise.beautyShop.model.Fragrance;
import com.exercise.beautyShop.service.IFragranceService;

public class FragranceServiceImpl implements IFragranceService{

	static List<Fragrance> fragrances = new ArrayList<Fragrance>();
	private static int incr = 0;

	@Override
	public Fragrance insert(Fragrance fragrance) {
		incr++;
		fragrance.setId(incr);
		this.fragrances.add(fragrance);
		return fragrance;
	}

	@Override
	public Fragrance update(Fragrance fragrance) {
		Fragrance aux = getById(fragrance.getId());

		if (aux != null) {
			aux.setName(fragrance.getName());
			aux.setBrand(fragrance.getBrand());
		}
		return aux;
	}

	@Override
	public void delete(Fragrance fragrance) {
		delete(fragrance.getId());

	}

	@Override
	public void delete(int id) {
		int posicao = -1;
		for (int i = 0; i < this.fragrances.size(); i++) {
			if (this.fragrances.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0)
			this.fragrances.remove(posicao);
	}

	@Override
	public Fragrance getById(int id) {
		for (Fragrance fragrance : fragrances) {
			if (fragrance.getId() == id) {
				return fragrance;
			}
		}
		return null;

	}

	@Override
	public List<Fragrance> getAll() {
		return fragrances;
	}
}
