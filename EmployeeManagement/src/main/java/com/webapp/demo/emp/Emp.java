package com.webapp.demo.emp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
    @Id
	private int empId;
	private String empName;
	private String empEmail;
	private String dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
