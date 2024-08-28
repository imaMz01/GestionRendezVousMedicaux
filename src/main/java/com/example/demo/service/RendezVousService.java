package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Medecin;
import com.example.demo.entities.Patient;
import com.example.demo.entities.RendezVous;

public interface RendezVousService {

	String addRendezVous(RendezVous r);
	RendezVous updateRendezVous(RendezVous r);
	void acceptRendezVous(int id);
	void annulRendezVous(int id);
	void addNoteRendezVous(int id, String note);
	List<RendezVous> list();
	List<RendezVous> list(Patient p);
	List<RendezVous> list(Medecin m);
}
