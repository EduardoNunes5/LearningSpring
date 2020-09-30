package com.learningSpring.photoautotrophService;


import java.util.List;
import org.springframework.stereotype.Service;

import com.learningSpring.models.Photoautotroph;

@Service
public class PhotoAutotrophService {
	
	private List<Photoautotroph> autotrophs;

	
	public PhotoAutotrophService(List<Photoautotroph> p) {
		this.autotrophs = p;
	}

	public List<Photoautotroph> getAutotrophs(){
		return this.autotrophs;
	}

}
