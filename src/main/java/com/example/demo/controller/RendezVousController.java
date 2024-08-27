package com.example.demo.controller;

import com.example.demo.service.RendezVousServIcemp;

public class RendezVousController {

	private RendezVousServIcemp rdv;

	
	public RendezVousController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RendezVousController(RendezVousServIcemp rdv) {
		super();
		this.rdv = rdv;
	}

	public RendezVousServIcemp getRdv() {
		return rdv;
	}

	public void setRdv(RendezVousServIcemp rdv) {
		this.rdv = rdv;
	}
	
	
}
