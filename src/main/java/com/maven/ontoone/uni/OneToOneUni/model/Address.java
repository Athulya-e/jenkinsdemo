package com.maven.ontoone.uni.OneToOneUni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id")
//	private int id;
	
	@Column(name="street")
	private String Street;
	
	@Column(name="city")
	private String City;
	
	@Column(name="zipcode")
	private String zipCode;

	public Address( String street, String city, String zipCode) {
		super();
		Street = street;
		City = city;
		this.zipCode = zipCode;
	}

/*	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Address()
	{
		
	}

}
