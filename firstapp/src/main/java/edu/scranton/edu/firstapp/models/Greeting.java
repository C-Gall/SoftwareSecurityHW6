package edu.scranton.edu.firstapp.models;

//Currently only a test class to ensure this had worked. Should be removed at later date.
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
