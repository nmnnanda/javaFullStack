package com.learning.Spring.constructorInjection.primitiveType;

public class Vehicle {
   private int vehicleId;
   private String vehicleName;
  
public Vehicle(int vehicleId, String vehicleName) {
	super();
	this.vehicleId = vehicleId;
	this.vehicleName = vehicleName;
}

@Override
public String toString() {
	return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + "]";
}




   
   
   
   
}
