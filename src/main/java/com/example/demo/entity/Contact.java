package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@NotNull
	@NotBlank
	@NotEmpty
	@Length(min=3, max=25)
	@Pattern(regexp = "^[a-z\sA-Z]")
	String fname;
	@NotNull
	@NotBlank
	@NotEmpty
	@Length(min=3, max=25)
	@Pattern(regexp = "^[a-z\sA-Z]")
	String lName;
	@NotNull
	@NotBlank
	String houseNumber;
	String street;
	@NotNull
	@NotBlank
	String city;
	@NotNull
	@NotBlank
	@Length(min=6)
	Integer pin;
	@NotNull
	@NotBlank
	@NotEmpty
	Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
