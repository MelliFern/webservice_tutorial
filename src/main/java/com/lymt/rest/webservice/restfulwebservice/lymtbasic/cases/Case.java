package com.lymt.rest.webservice.restfulwebservice.lymtbasic.cases;

import java.util.Date;

public class Case {
	
	private Integer id;
	private String firstName; 
	private String lastName;
	private Date dateOfBirth; 
	private String address; 
	private String city; 
	private Integer zipcode;
	
	protected Case(){
		
	}
	
	public Case(Integer id, String firstName, String lastName, Date dateOfBirth, String address, String city, Integer zipcode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Case [id = "+id +"firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", city=" + city + ", zipcode=" + zipcode + "]";
	}

}
