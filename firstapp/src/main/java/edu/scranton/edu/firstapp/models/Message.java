package edu.scranton.edu.firstapp.models;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

public class Message {
	@NotBlank
	private int messageID;
	
	@NotBlank
	@Size(max = 30)
	private String username;
	
	@NotBlank
	private String message;
	
	//Constructors(?)
	public Message(int messageID, String username, String message) {
		this.messageID = messageID;
		this.username = username;
		this.message = message;
	}
	
	//Getters and Setters
	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
