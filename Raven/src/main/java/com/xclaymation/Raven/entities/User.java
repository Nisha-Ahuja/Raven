package com.xclaymation.Raven.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	private String emailId;
	private int Empid;
	private String Emp_Name;
	
	@Id
	private int EAutoid;
	
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	
	public User(String emailId, int empid, String emp_Name, int eAutoid) {
		super();
		this.emailId = emailId;
		Empid = empid;
		Emp_Name = emp_Name;
		EAutoid = eAutoid;
	}
	
	public User() {}
}
