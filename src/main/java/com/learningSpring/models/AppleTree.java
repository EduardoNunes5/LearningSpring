package com.learningSpring.models;

import org.springframework.stereotype.Component;

@Component
public class AppleTree implements Photoautotroph{
	
	
	private String name;

	public  AppleTree() {
		this.name = "Apple tree";
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String photosynthesis() {
		return String.format("%s perfoming photosynthesis", this.name);
	}
	

}
