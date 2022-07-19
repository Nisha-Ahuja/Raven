package com.xclaymation.Raven.entities;

import java.util.List;

public class UserInformation {
private String userName;
private String empId;
private String designation;
private Integer pointOfTests;
private List<CollegueDetails> collegues;
private List<Badge> badges;
private List<UpcomingTrainings> upcomingTrainings;
private String profileImageurl ;
private List<CompletedCourses> completedCourses;
private List<Certificate> certificate;
private List<CoursesInProgress> courseInProgress;
private String timeSpent; // make it an Object as per the DataSet sent by Raja
private int userProgressInPercentage;
private String growth;
private List<Roles> roles; // as per the 

//Employee Table

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Integer getPointOfTests() {
	return pointOfTests;
}
public void setPointOfTests(Integer pointOfTests) {
	this.pointOfTests = pointOfTests;
}
public List<CollegueDetails> getCollegues() {
	return collegues;
}
public void setCollegues(List<CollegueDetails> collegues) {
	this.collegues = collegues;
}
public List<Badge> getBadges() {
	return badges;
}
public void setBadges(List<Badge> badges) {
	this.badges = badges;
}
public List<UpcomingTrainings> getUpcomingTrainings() {
	return upcomingTrainings;
}
public void setUpcomingTrainings(List<UpcomingTrainings> upcomingTrainings) {
	this.upcomingTrainings = upcomingTrainings;
}
public String getProfileImageurl() {
	return profileImageurl;
}
public void setProfileImageurl(String profileImageurl) {
	this.profileImageurl = profileImageurl;
}
public List<CompletedCourses> getCompletedCourses() {
	return completedCourses;
}
public void setCompletedCourses(List<CompletedCourses> completedCourses) {
	this.completedCourses = completedCourses;
}
public UserInformation(String userName, String empId, String designation, Integer pointOfTests,
		List<CollegueDetails> collegues, List<Badge> badges, List<UpcomingTrainings> upcomingTrainings,
		String profileImageurl, List<CompletedCourses> completedCourses) {
	super();
	this.userName = userName;
	this.empId = empId;
	this.designation = designation;
	this.pointOfTests = pointOfTests;
	this.collegues = collegues;
	this.badges = badges;
	this.upcomingTrainings = upcomingTrainings;
	this.profileImageurl = profileImageurl;
	this.completedCourses = completedCourses;
}


//  inProgress onHold;


}
