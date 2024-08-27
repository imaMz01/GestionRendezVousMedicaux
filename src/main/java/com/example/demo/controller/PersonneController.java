package com.example.demo.controller;

import com.example.demo.service.PersonneServiceImp;

public class PersonneController {

	private PersonneServiceImp per;

	
	public PersonneController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonneController(PersonneServiceImp per) {
		super();
		this.per = per;
	}

	public PersonneServiceImp getPer() {
		return per;
	}

	public void setPer(PersonneServiceImp per) {
		this.per = per;
	}
	
	
}
