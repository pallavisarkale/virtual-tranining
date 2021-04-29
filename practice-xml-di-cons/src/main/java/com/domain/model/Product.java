package com.domain.model;

public class Product {

	private String ProductId;
	private String ProductName;
	private float Price;
	
	
	
	public Product(String productId, String productName, float price) {
		super();
		ProductId = productId;
		ProductName = productName;
		Price = price;
	}



	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + "]";
	}
	
	
	

}
