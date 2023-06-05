package com.learning.Spring.autowiring.constructor;

public class Owner {
	private int ownerId;
	private String ownerName;
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
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
