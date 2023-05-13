package com.bridgelabz.user.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class PayrollModel {

	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String gender;
	private String department;
	private long salary;
	private String action;
	private String notes;
	private String image;

  // @JsonFormat(pattern = "dd-mm-yyyy")
	private String startDate;

	public String getName() {
		return name;
	}

	public int getEmail() {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(int email) {
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

	public String getStartDate() {
		return startDate;
	}

	public void setAction(String action) {
		this.action = action;
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
