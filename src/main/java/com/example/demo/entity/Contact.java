package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String firstName;
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String lastName;
	@Range(min = 0)
	@NotNull
	private Integer age;
	@NotBlank
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
	@Size(max = 7)
	private String houseNumber;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String street;
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String city;
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 7)
	private String pin;
	
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
	public void setPin(String pin) {
		this.pin = pin;
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

	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
