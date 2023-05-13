package com.bridgelabz.user;

//import com.bridgelabz.user.dto.RegisterDto;

public class Response {
	String message;
	Object payroll;

	public Response(String message, Object payrollModel) {
		this.message = message;
		this.payroll = payrollModel;
	}

	public Response(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public Object getUser() {
		return payroll;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUser(Object user) {
		this.payroll = user;
	}

}
