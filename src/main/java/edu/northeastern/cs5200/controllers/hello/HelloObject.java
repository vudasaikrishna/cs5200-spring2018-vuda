package edu.northeastern.cs5200.controllers.hello;

public class HelloObject {

	private String message;
//	Constructors
	public HelloObject() {
		
	}
	public HelloObject(String message) {
		this.message = message;
	}
//	public methods
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
