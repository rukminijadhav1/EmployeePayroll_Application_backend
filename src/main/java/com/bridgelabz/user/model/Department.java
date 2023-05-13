package com.bridgelabz.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	private int departmentId;
	private String departmentName;

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
