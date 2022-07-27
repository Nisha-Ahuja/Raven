package com.xclaymation.Raven.entities;

public class Program {
	private String programTitle;
	private String programShortDiscription;
	private Training trainings;
	
	public String getProgramTitle() {
		return programTitle;
	}
	public void setProgramTitle(String programTitle) {
		this.programTitle = programTitle;
	}
	public String getProgramShortDiscription() {
		return programShortDiscription;
	}
	public void setProgramShortDiscription(String programShortDiscription) {
		this.programShortDiscription = programShortDiscription;
	}
	public Training getTrainings() {
		return trainings;
	}
	public void setTrainings(Training trainings) {
		this.trainings = trainings;
	}
	public Program(String programTitle, String programShortDiscription, Training trainings) {
		super();
		this.programTitle = programTitle;
		this.programShortDiscription = programShortDiscription;
		this.trainings = trainings;
	}
	
	public Program() {}
	
	

	
}
