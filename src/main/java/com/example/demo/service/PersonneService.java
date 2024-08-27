package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Medecin;
import com.example.demo.entities.Patient;
import com.example.demo.entities.Personne;

public interface PersonneService {

	Personne addPersonne(Patient p);
	Personne addPersonne(Medecin p);
	Personne updatePersonne(Patient p);
	Personne updatePersonne(Medecin p);
	List<Personne> list();
}
