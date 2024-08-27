package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Medecin;
import com.example.demo.entities.Patient;
import com.example.demo.entities.RendezVous;
import com.example.demo.enumeration.Etat;

public class RendezVousServIcemp implements RendezVousService{

	List<RendezVous> rendezVous;

//	public RendezVousServIcemp() {
//		super();
//		rendezVous=new ArrayList<>();
//	}
	
	@Override
	public RendezVous addRendezVous(RendezVous r) {
		// TODO Auto-generated method stub
		rendezVous.add(r);
		return r;
	}

	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	@Override
	public RendezVous updateRendezVous(RendezVous r) {
		// TODO Auto-generated method stub
		rendezVous.forEach(elmt->{
			if(elmt.getId()==r.getId()) {
				elmt.setDate(r.getDate());
				elmt.setEtat(r.getEtat());
				elmt.setNote(r.getNote());
			}
		});
		return r;
	}

	@Override
	public List<RendezVous> list() {
		// TODO Auto-generated method stub
		return rendezVous;
	}

	@Override
	public List<RendezVous> list(Patient p) {
		List<RendezVous> rdv=new ArrayList<>();
		rendezVous.forEach(elmt->{
			if(elmt.getPatient().getId()==p.getId()) {
				rdv.add(elmt);
			}
		});
		return rdv;
	}

	@Override
	public List<RendezVous> list(Medecin m) {
		List<RendezVous> rdv=new ArrayList<>();
		rendezVous.forEach(elmt->{
			if(elmt.getMedecin().getId()==m.getId()) {
				rdv.add(elmt);
			}
		});
		return rdv;
	}

	@Override
	public void acceptRendezVous(int id) {
		// TODO Auto-generated method stub
		rendezVous.forEach(elmt->{
			if(elmt.getId()==id) {
				elmt.setEtat(Etat.accepte);
			}
		});
	}

	@Override
	public void annulRendezVous(int id) {
		// TODO Auto-generated method stub
		rendezVous.forEach(elmt->{
			if(elmt.getId()==id) {
				elmt.setEtat(Etat.annulee);
			}
		});
	}

	@Override
	public void addNoteRendezVous(int id, String note) {
		// TODO Auto-generated method stub
		rendezVous.forEach(elmt->{
			if(elmt.getId()==id) {
				elmt.setNote(note);
			}
		});
	}
	
	
	
	
}
