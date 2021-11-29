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
	
	@Size(max = 64) //SHA-256 should produce 64 CHAR long string, unsure of if it should be present in the model class.
	private String password;
}
