package com.learning.JPA.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="vehicle_data")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicle_id;
	private String vehicle_name;
	private String vehicle_type;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="owner_id")
	private Owner owner;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vehicle_id, String vehicle_name, String vehicle_type, Owner owner) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_name = vehicle_name;
		this.vehicle_type = vehicle_type;
		this.owner = owner;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_name=" + vehicle_name + ", vehicle_type=" + vehicle_type
				+ ", owner=" + owner + "]";
	}
	
	
	
	
	

}
