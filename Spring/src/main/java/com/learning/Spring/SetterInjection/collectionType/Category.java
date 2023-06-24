 package com.learning.Spring.SetterInjection.collectionType;

import java.util.List;

public class Category {
 private int categoryId;
 private String categoryName;
 private List<String> products;
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public List<String> getProducts() {
	return products;
}
public void setProducts(List<String> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", products=" + products + "]";
}
 
 
 
 
}
