 package com.learning.Spring.constructorInjection.referenceType;

public class Vehicle {
   private int vehicleId;
   private String vehicleName;
   private Owner owner;
public Vehicle(int vehicleId, String vehicleName,Owner owner) {
	super();
	this.vehicleId = vehicleId;
	this.vehicleName = vehicleName;
	this.owner = owner;
}
@Override
public String toString() {
	return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", owner=" + owner + "]";
}

   
   
   
   
}
