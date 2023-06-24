 package com.learning.JPA.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="owner_data")
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int owner_id;
	private String owner_name;
	
	@OneToOne(mappedBy="owner")
	private Vehicle vehicle;
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(int owner_id, String owner_name) {
		super();
		this.owner_id = owner_id;
		this.owner_name = owner_name;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public Owner(int owner_id, String owner_name, Vehicle vehicle) {
		super();
		this.owner_id = owner_id;
		this.owner_name = owner_name;
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Owner [owner_id=" + owner_id + ", owner_name=" + owner_name + "]";
	}
}
