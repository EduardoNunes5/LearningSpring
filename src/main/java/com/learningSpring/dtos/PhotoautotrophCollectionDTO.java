package com.learningSpring.dtos;

import java.util.List;

import com.learningSpring.models.Photoautotroph;

public class PhotoautotrophCollectionDTO {
	
	private String message;
	
	private List<Photoautotroph> photoautotrophBeings;
	
	
	
	public PhotoautotrophCollectionDTO(List<Photoautotroph> photoautotrophBeings) {
		this.message = "Seres vivos capazes de realizar fotossíntese";
		this.photoautotrophBeings = photoautotrophBeings;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public List<Photoautotroph> getPhotoautotrophBeings() {
		return photoautotrophBeings;
	}



	public void setPhotoautotrophBeings(List<Photoautotroph> photoautotrophBeings) {
		this.photoautotrophBeings = photoautotrophBeings;
	}
	
	
	
	
	

}
