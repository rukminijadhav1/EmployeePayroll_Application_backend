package com.bridgelabz.user.dto;


import java.util.List;

import org.springframework.stereotype.Component;

import com.bridgelabz.user.model.Department;


import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Component
public class RegisterDto {
	private String name;
	
	private int id;
	private String gender;
	
	
	private String department;
	private long salary;
	private String action;
	private String notes;
	private String image;

	//@JsonDeserialize
	//@JsonFormat(pattern = "")
	private String startDate;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public long getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getNotes() {
		return notes;
	}

	public String getImage() {
		return image;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

	
}
