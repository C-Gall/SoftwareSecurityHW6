package edu.scranton.edu.firstapp.models;

import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class User {
	@NotBlank 
	@Email
	private String email;
	
	@Size(max = 50)
	private String firstName;
	
	@Size(max = 50)
	private String lastName;
	
	@Size(max = 60) //BCrypt should produce 60 CHAR long string, unsure of if it should be present in the model class.
	private String password;
	
	//Getters and Setters
	public String getEmail() {
		return email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
