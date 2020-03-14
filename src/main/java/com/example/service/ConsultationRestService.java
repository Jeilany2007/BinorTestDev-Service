package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Consultation;
import com.example.metier.ConsultationMetier;

@RestController
@CrossOrigin("*")
public class ConsultationRestService {
	
	@Autowired
	private ConsultationMetier ConsultationMetier;
	
	@PostMapping(value ="/consultation")
	public Consultation saveConsultation(Consultation consult) {
		return ConsultationMetier.saveConsultation(consult);
	}
	
	@GetMapping(value ="/consultation")
	public List<Consultation> listConsultation() {
		return ConsultationMetier.listConsultation();
	}
	
	/*
	 * @PostMapping(value ="/consultation") public Consultation
	 * saveEtatCivili(@RequestBody Consultation consult) { return
	 * ConsultationMetier.saveConsultation(consult); }
	 * 
	 * @GetMapping(value ="/consultation" ) public List<Consultation>
	 * listEtatCivil() { return ConsultationMetier.listConsultation(); }
	 */
	

}
