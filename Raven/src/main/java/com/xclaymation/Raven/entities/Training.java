package com.xclaymation.Raven.entities;

public class Training {

	private String trainingStatus;
	private String trainingTitle;
	private String trainingShortDiscription;
	private String trainingLink;
	
	
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	public String getTrainingTitle() {
		return trainingTitle;
	}
	public void setTrainingTitle(String trainingTitle) {
		this.trainingTitle = trainingTitle;
	}
	public String getTrainingShortDiscription() {
		return trainingShortDiscription;
	}
	public void setTrainingShortDiscription(String trainingShortDiscription) {
		this.trainingShortDiscription = trainingShortDiscription;
	}
	public String getTrainingLink() {
		return trainingLink;
	}
	public void setTrainingLink(String trainingLink) {
		this.trainingLink = trainingLink;
	}
	public Training(String trainingStatus, String trainingTitle, String trainingShortDiscription, String trainingLink) {
		super();
		this.trainingStatus = trainingStatus;
		this.trainingTitle = trainingTitle;
		this.trainingShortDiscription = trainingShortDiscription;
		this.trainingLink = trainingLink;
	}
	
	public Training()
	{
		
	}
	
}
