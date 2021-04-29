package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.repository.ProductImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * ProductImpl productIml=new ProductImpl(); ClassPathXmlApplicationContext
		 * classPath=new ClassPathXmlApplicationContext("applicationContext.xml");
		 */
		
		//OR
		ProductImpl productIml1=null;
		ClassPathXmlApplicationContext classPath=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		productIml1=classPath.getBean("productImpl",ProductImpl.class);
		System.out.println(productIml1.findAll());


	}

}
