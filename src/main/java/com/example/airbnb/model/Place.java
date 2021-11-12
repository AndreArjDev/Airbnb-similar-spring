package com.example.airbnb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Place {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private String city;
	
	private String address;
	private String host;
	
	@Override
	public String toString() {
		return "Place [id=" + id + ", TIPO=" + type + ", Localicade=" + city + ", Endereço=" + address + ", Anfitrião=" + host
				+ "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	
	
	public Place(String type, String city, String address, String host) {
		super();
		this.type = type;
		this.city = city;
		this.address = address;
		this.host = host;
	}
	public Place() {}
	
	
}
