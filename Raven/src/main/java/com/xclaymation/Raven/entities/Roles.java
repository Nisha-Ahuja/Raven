package com.xclaymation.Raven.entities;

import java.util.List;

public class Roles {
	
	private String roleTitle;
	private String roleImageUrl;
	private String roleShortDiscription;
	private List<Training> trainings;
	
	public String getRoleTitle() {
		return roleTitle;
	}
	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}
	public String getRoleImageUrl() {
		return roleImageUrl;
	}
	public void setRoleImageUrl(String roleImageUrl) {
		this.roleImageUrl = roleImageUrl;
	}
	public String getRoleShortDiscription() {
		return roleShortDiscription;
	}
	public void setRoleShortDiscription(String roleShortDiscription) {
		this.roleShortDiscription = roleShortDiscription;
	}
	public List<Training> getTrainings() {
		return trainings;
	}
	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}
	public Roles(String roleTitle, String roleImageUrl, String roleShortDiscription, List<Training> trainings) {
		super();
		this.roleTitle = roleTitle;
		this.roleImageUrl = roleImageUrl;
		this.roleShortDiscription = roleShortDiscription;
		this.trainings = trainings;
	}
	
	public Roles() {}
	
	
	

}
