package com.example.metier;

import java.util.List;

import com.example.entities.Consultation;

public interface ConsultationMetier {
	public Consultation saveConsultation(Consultation consult);
	public List<Consultation> listConsultation();

}
