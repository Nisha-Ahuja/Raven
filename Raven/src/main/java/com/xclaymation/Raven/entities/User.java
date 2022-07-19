package com.xclaymation.Raven.entities;


public class User {
	
	private String Password;
	private String emailID;
	private String empId;
	
	//UserMaster Table
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public User() {
	
		
	}

	public User(String password, String emailID, String empId) {
		super();
		Password = password;
		this.emailID = emailID;
		this.empId = empId;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
