package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consultation implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNassaince;
	private String sexe;
	private String photo;
	private String groupsanguin;
	private double poid;
	private double taille;
	private String observation;

	
	public Consultation() {
		super();
		
	}


	public Consultation(String nom, String prenom, Date dateNassaince, String sexe, String photo, String groupsanguin,
			double poid, double taille, String observation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNassaince = dateNassaince;
		this.sexe = sexe;
		this.photo = photo;
		this.groupsanguin = groupsanguin;
		this.poid = poid;
		this.taille = taille;
		this.observation = observation;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNassaince() {
		return dateNassaince;
	}


	public void setDateNassaince(Date dateNassaince) {
		this.dateNassaince = dateNassaince;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getGroupsanguin() {
		return groupsanguin;
	}


	public void setGroupsanguin(String groupsanguin) {
		this.groupsanguin = groupsanguin;
	}


	public double getPoid() {
		return poid;
	}


	public void setPoid(double poid) {
		this.poid = poid;
	}


	public double getTaille() {
		return taille;
	}


	public void setTaille(double taille) {
		this.taille = taille;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	
	

}