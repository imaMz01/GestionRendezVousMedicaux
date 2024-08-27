package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.controller.PersonneController;
import com.example.demo.controller.RendezVousController;
import com.example.demo.entities.Medecin;
import com.example.demo.entities.Patient;
import com.example.demo.entities.RendezVous;
import com.example.demo.enumeration.Etat;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
			ApplicationContext context = new ClassPathXmlApplicationContext("Personne.xml");

			PersonneController Pers = (PersonneController) context.getBean("PersonneController");
			Pers.getPer().addPersonne(new Patient(1, "NomP1", "PrenomP1"));
			Pers.getPer().addPersonne(new Patient(2, "NomP2", "PrenomP2"));
			Pers.getPer().addPersonne(new Patient(3, "NomP3", "PrenomP3"));
			Pers.getPer().addPersonne(new Medecin(1, "NomM1", "PrenomM1", true));
			Pers.getPer().addPersonne(new Medecin(2, "NomM2", "PrenomM2", true));
			Pers.getPer().addPersonne(new Medecin(3, "NomM3", "PrenomM3", true));
			System.out.println("***Afficher la liste des medecins et des patients***");
			Pers.getPer().list().forEach(elmt->elmt.info());
			System.out.println("***Mettre à jour des informations des médecins et des patients***");
			Pers.getPer().updatePersonne(new Patient(2, "NomP2Updated", "PrenomP2")).info();
			Pers.getPer().updatePersonne(new Medecin(1, "NomM1", "PrenomM1Updated",false)).info();;
			System.out.println("***Afficher la liste des medecins et des patients***");
			Pers.getPer().list().forEach(elmt->elmt.info());
			ApplicationContext context1 = new ClassPathXmlApplicationContext("RendezVous.xml");

			RendezVousController rdv = (RendezVousController) context1.getBean("RendezVousController");
			rdv.getRdv().addRendezVous(new RendezVous(1, "", LocalDate.parse("2024-08-12"), Etat.en_Attente, new Patient(1, "NomP1", "PrenomP1"), new Medecin(3, "NomM3", "PrenomM3", true)));
			rdv.getRdv().addRendezVous(new RendezVous(2, "", LocalDate.parse("2024-08-12"), Etat.en_Attente, new Patient(2, "NomP2", "PrenomP2"), new Medecin(3, "NomM3", "PrenomM3", true)));
			rdv.getRdv().addRendezVous(new RendezVous(3, "", LocalDate.parse("2024-08-12"), Etat.en_Attente, new Patient(3, "NomP3", "PrenomP3"), new Medecin(2, "NomM2", "PrenomM2", true)));
			System.out.println("**Afficher la liste des rendez vous d'un medecin**");
			rdv.getRdv().list(new Medecin(3, "NomM3", "PrenomM3", true)).forEach(elmt->elmt.info());
			System.out.println("**Afficher la liste des rendez vous d'un patient**");
			rdv.getRdv().list(new Patient(3, "NomP3", "PrenomP3")).forEach(el->el.info());
			System.out.println("Accepter un rendez vous :");
			rdv.getRdv().acceptRendezVous(1);
			System.out.println("Annuler un rendez vous :");
			rdv.getRdv().annulRendezVous(3);
			System.out.println("Modifier un rendez vous :");
			rdv.getRdv().updateRendezVous(new RendezVous(2, "", LocalDate.parse("2024-08-15"), Etat.en_Attente, new Patient(2, "NomP2", "PrenomP2"), new Medecin(3, "NomM3", "PrenomM3", true)));
			System.out.println("Ajouter une note a un rendez vous :");
			rdv.getRdv().addNoteRendezVous(1, "note");
			System.out.println("**Afficher la liste des rendez vous **");
			rdv.getRdv().list().forEach(elmt->elmt.info());
	}

}
