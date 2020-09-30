package com.learningSpring.models;


import org.springframework.stereotype.Component;


@Component
public class ElysiaChlorotica implements Photoautotroph{
	
	
	private String name;
	
	
	public ElysiaChlorotica() {
		this.name = "Elysia Chlorotica (Green sea slug)";
	}
	
	@Override
	public String photosynthesis() {
		return String.format("%s performing photosynthesis", this.name);
	}
	
	public String getName() {
		return this.name;
	}

}
