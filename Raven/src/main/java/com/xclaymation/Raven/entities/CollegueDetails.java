package com.xclaymation.Raven.entities;

public class CollegueDetails {
      
	private String collegueName;
	private String progress;
	private String pointsGained;
	private String avatarSmall;
	
	
	public CollegueDetails() {
		
	}
	
	public CollegueDetails(String collegueName, String progress, String pointsGained, String avatarSmall) {
		super();
		this.collegueName = collegueName;
		this.progress = progress;
		this.pointsGained = pointsGained;
		this.avatarSmall = avatarSmall;
	}
	public String getCollegueName() {
		return collegueName;
	}
	public void setCollegueName(String collegueName) {
		this.collegueName = collegueName;
	}
	public String getTotalCourseCompleted() {
		return progress;
	}
	public void setTotalCourseCompleted(String progress) {
		this.progress = progress;
	}
	public String getPointsGained() {
		return pointsGained;
	}
	public void setPointsGained(String pointsGained) {
		this.pointsGained = pointsGained;
	}
	public String getAvatarSmall() {
		return avatarSmall;
	}
	public void setAvatarSmall(String avatarSmall) {
		this.avatarSmall = avatarSmall;
	}
}
