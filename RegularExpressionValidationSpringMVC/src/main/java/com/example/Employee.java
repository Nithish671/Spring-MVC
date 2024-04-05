package com.example;

import jakarta.validation.constraints.Pattern;

public class Employee {

	private String name;
	
	@Pattern(regexp="^.{8,}$", message="*Password length must be 8 or more!")
	@Pattern(regexp="^(?=.*[a-zA-Z])(?=.*\\d).+$", message="\n*Password must contain mix of letters and numbers!")
	private String pass;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	} 
	
	public String getPass() {
		return pass;
	}
	
}
