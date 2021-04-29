package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductImpl {
	
	public List<Product> findAll()
	{
	
		List<Product> pList=new ArrayList<Product>();
		pList.add(new Product("1", "ABC", 10));
		pList.add(new Product("2","PQr",20));
		
		return pList;
	}

}
