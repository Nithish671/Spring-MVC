package com.example;

public class Reservation {

	private String firstName;
	private String lastName;
	private String gender;
	private String[] food;
	
	public Reservation() {}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setFood(String[] food) {
		this.food = food;	
	}
	
	public String[] getFood() {
		return food;
	}
	
}
