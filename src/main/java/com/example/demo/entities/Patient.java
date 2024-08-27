package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Personne{

	List<RendezVous> rdv;

	public Patient() {
		super();
		this.rdv = new ArrayList<>();
	}
	

	public Patient(int id, String nom, String prenom) {
		super(id, nom, prenom);
		this.rdv = new ArrayList<>();
	}


	public List<RendezVous> getRdv() {
		return rdv;
	}

	public void setRdv(List<RendezVous> rdv) {
		this.rdv = rdv;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("***********Patient N° "+getId()+" *******");
		System.out.println("Nom : "+getNom());
		System.out.println("Prenom : "+getPrenom());
		if(rdv.size()>0) {
			rdv.forEach(elmt->elmt.info());
		}
	}
	
}
