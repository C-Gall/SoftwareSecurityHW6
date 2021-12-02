package edu.scranton.edu.firstapp.utilities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//Temporary class for hashing passwords. To be implemented better later.
public class Hash {
	public String bCryptHasher(String input) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(input);
		return hashedPassword;
	}
}
