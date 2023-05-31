package com.learning.JPA.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Product {
	private String productName;
	private String productCategory;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String productCategory) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCategory=" + productCategory + "]";
	}
	
	

}
