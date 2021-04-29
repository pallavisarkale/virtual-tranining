package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	public List<Product> findAll() {

		List<Product> pList=new ArrayList<Product>();
		pList.add(new Product("1", "Pallavi", 123));
		pList.add(new Product("2", "Arohi", 123));

		
		return pList;
	}

}
