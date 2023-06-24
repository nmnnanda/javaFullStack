 package com.learning.Spring.SetterInjection.collectionType;

public class Products {
    private int productId;
    private String productName;
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + "]";
	}
    
    
    
}
