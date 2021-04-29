package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductRepositoryImpl implements ProductInterFace {

	public List<Product> findAll() {

		List<Product> pList=new ArrayList<Product>();
		pList.add(new Product("1","Abc", 10));
		pList.add(new Product("2","PQR", 20));

		
		return pList;
	}
	
	
	
}
