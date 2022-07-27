package com.xclaymation.Raven.entities;

import java.util.List;

public class Roadmap {

	
	private int programCount;
	private List<Program>  programs;
	
	public int getProgramCount() {
		return programCount;
	}
	public void setProgramCount(int programCount) {
		this.programCount = programCount;
	}
	public List<Program> getPrograms() {
		return programs;
	}
	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}
	public Roadmap(int programCount, List<Program> programs) {
		super();
		this.programCount = programCount;
		this.programs = programs;
	}
	
	public Roadmap() {}
	
}
