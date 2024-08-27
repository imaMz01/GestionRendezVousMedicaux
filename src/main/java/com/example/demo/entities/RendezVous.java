package com.example.demo.entities;

import java.time.LocalDate;

import java.util.Date;

import com.example.demo.enumeration.Etat;



public class RendezVous {

	private int id;
	private String note;
	private LocalDate date;
	private Etat etat;
	private Patient patient;
	private Medecin medecin;
	
	
	public RendezVous(int id, String note, LocalDate date, Etat etat, Patient patient, Medecin medecin) {
		super();
		this.id = id;
		this.note = note;
		this.date = date;
		this.etat = etat;
		this.patient = patient;
		this.medecin = medecin;
	}
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public void info() {
		System.out.println("**Les informations du rendez-vous : **");
		System.out.println("Date : "+date);
		System.out.println("Etat : "+etat);
		System.out.println("Medecin : ");
		medecin.info();
		System.out.println("Patient : ");
		patient.info();
		if(note!="")
			System.out.println("Note :"+note);
	}
}
