package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Medecin;
import com.example.demo.entities.Patient;
import com.example.demo.entities.Personne;

public class PersonneServiceImp implements PersonneService{

	List<Personne> personnes;
	
//	public PersonneServiceImp() {
//		super();
//		personnes=new ArrayList<>(); 
//	}

	@Override
	public Personne addPersonne(Patient p) {
		// TODO Auto-generated method stub
		personnes.add(p);
		return p;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public Personne addPersonne(Medecin p) {
		// TODO Auto-generated method stub
		personnes.add(p);
		return p;
	}

	@Override
	public Personne updatePersonne(Patient p) {
		// TODO Auto-generated method stub
		personnes.forEach(elmt->{
			if(elmt instanceof Patient && elmt.getId()==p.getId()) {
				elmt.setNom(p.getNom());
				elmt.setPrenom(p.getPrenom());
				((Patient) elmt).setRdv(p.getRdv());
			}
		});
		return p;
	}

	@Override
	public Personne updatePersonne(Medecin p) {
		// TODO Auto-generated method stub
		personnes.forEach(elmt->{
			if(elmt instanceof Medecin && elmt.getId()==p.getId()) {
				elmt.setNom(p.getNom());
				elmt.setPrenom(p.getPrenom());
				((Medecin) elmt).setRedv(p.getRedv());
			}
		});
		return p;
	}

	@Override
	public List<Personne> list() {
		// TODO Auto-generated method stub
		return personnes;
	}

	
}
