package com.bridgelabz.user.exception;

public class EmpException extends RuntimeException{
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmpException(String message) {
		
		this.message = message;
	}
}
