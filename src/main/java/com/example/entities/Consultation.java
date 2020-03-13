package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consultation implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
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

}