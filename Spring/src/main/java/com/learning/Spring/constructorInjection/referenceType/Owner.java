 package com.learning.Spring.constructorInjection.referenceType;

public class Owner {
	
	private int ownerId;
	private String ownerName;
	public Owner(int ownerId, String ownerName) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + "]";
	}
	
	

}
