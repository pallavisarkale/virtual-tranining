package com.domain;

import java.util.List;

import com.domain.model.Product;
import com.domain.repository.ProductImpl;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Spring ");
		ProductImpl productImpl=new ProductImpl();
		//List<Product> result=productImpl.findAll();
		//System.out.println(result);
		
		System.out.println(productImpl.findAll());
	}

}
