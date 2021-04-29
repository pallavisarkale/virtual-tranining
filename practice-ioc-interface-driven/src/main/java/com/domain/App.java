package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.domain.repository.ProductInterFace;
import com.domain.repository.ProductRepositoryImpl;

public class App {

	public static void main(String[] args) {

		useFileSyste();
		//useClassPath();
		
		
	}

	private static void useClassPath() {
		ProductInterFace productRepository = null;
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		productRepository = applicationContext.getBean("productRepository", ProductRepositoryImpl.class);
		System.out.println(productRepository.findAll());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

	private static void useFileSyste() {
		ProductInterFace productInterFace=null;
		
		ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
				"D:\\\\STS\\\\practice-ioc-interface-driven\\\\src\\\\main\\\\resources\\\\applicationContext.xml");
		productInterFace=applicationContext.getBean("productRepository",ProductRepositoryImpl.class);
	
		System.out.println(productInterFace.findAll());
		((FileSystemXmlApplicationContext) applicationContext).close();

	}

}
