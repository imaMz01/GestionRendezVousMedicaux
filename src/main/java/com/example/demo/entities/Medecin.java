package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Medecin extends Personne{

	private boolean disponible;
	List<RendezVous> redv;
	public Medecin(int id, String nom, String prenom, boolean disponible) {
		super(id, nom, prenom);
		this.disponible = disponible;
		this.redv=new ArrayList<>();
	}
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medecin(int id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public List<RendezVous> getRedv() {
		return redv;
	}
	public void setRedv(List<RendezVous> redv) {
		this.redv = redv;
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("***********Medecin N° "+getId()+" *******");
		System.out.println("Nom : "+getNom());
		System.out.println("Prenom : "+getPrenom());
		System.out.println("Disponible : "+isDisponible());
		if(redv.size()>0) {
			redv.forEach(elmt->elmt.info());
		}
		
	}
	
	
	
}
