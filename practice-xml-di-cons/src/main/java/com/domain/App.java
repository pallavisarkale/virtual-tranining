package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.domain.repository.ProductRepository;
import com.domain.repository.ProductRepositoryImpl;
public class App {
	public static void main(String[] args) {
		useClassPath();
		//useFileSystem();
		System.out.println("App with Spring and IOC....");

	}

	private static void useClassPath() {
		ProductRepository productRepository = null;
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		productRepository = applicationContext.getBean("productRepository", ProductRepositoryImpl.class);
		System.out.println(productRepository.findAll());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

	private static void useFileSystem() {
		ProductRepository productRepository = null;
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"D:\\STS\\ld1a-xml-ioc-interface-driven\\src\\main\\resources\\applicationContext.xml");
		productRepository = applicationContext.getBean("productRepository", ProductRepositoryImpl.class);
		System.out.println(productRepository.findAll());
		((FileSystemXmlApplicationContext) applicationContext).close();
	}
}