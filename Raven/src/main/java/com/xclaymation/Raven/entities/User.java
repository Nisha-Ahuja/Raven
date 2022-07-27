package com.xclaymation.Raven.entities;

public class User {
	
	private String emailId;
	private int userId;
	private String userName;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User(String emailId, int userId, String userName) {
		super();
		this.emailId = emailId;
		this.userId = userId;
		this.userName = userName;
	}
	public User()
	{
		
	}
	

}
