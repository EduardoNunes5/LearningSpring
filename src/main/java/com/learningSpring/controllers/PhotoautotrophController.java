package com.learningSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningSpring.dtos.PhotoautotrophCollectionDTO;
import com.learningSpring.models.Photoautotroph;
import com.learningSpring.photoautotrophService.PhotoAutotrophService;

@RestController
public class PhotoautotrophController {
	
	private PhotoAutotrophService service;
	
	public PhotoautotrophController(PhotoAutotrophService service) {
		super();
		this.service = service;
	}

	@GetMapping(value="/autotrofos")
	public ResponseEntity<?> metodo() {
		List<Photoautotroph> photoautotrophs = this.service.getAutotrophs();
		System.out.println(photoautotrophs);
		if(photoautotrophs == null || photoautotrophs.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(new PhotoautotrophCollectionDTO(photoautotrophs), HttpStatus.OK);
	}
	
}
