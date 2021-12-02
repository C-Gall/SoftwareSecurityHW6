package edu.scranton.edu.firstapp.models;

import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class User {
	@NotBlank
	private int userID;
	
	@NotBlank
	@Size(max = 30)
	private String username;
	
	@NotBlank
	@Size(max = 60) //BCrypt should produce 60 CHAR long string, unsure of if it should be present in the model class.
	private String password;
	
	@NotBlank
	@Email
	@Size(max = 254) //Supposed max size for emails.
	private String email;
	
	//Constructors(?)
	public User (int userID, String username, String password, String email) {
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	//Getters and Setters
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
