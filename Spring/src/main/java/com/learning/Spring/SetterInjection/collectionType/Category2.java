 package com.learning.Spring.SetterInjection.collectionType;

import java.util.List;

public class Category2 {
	 private int categoryId;
	 private String categoryName;
	 private List<Products> products;
	 
	 public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category2 [categoryId=" + categoryId + ", categoryName=" + categoryName + ", products=" + products
				+ "]";
	}
	
	 
	 
	 
}
