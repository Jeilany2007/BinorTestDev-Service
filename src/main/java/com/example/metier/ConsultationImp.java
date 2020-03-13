package com.example.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ConsultationRepository;
import com.example.entities.Consultation;

@Service
public class ConsultationImp implements ConsultationMetier{
	
	@Autowired
	private ConsultationRepository consultrep;

	@Override
	public Consultation saveConsultation(Consultation consult) {
		// TODO Auto-generated method stub
		return consultrep.save(consult);
	}

	@Override
	public List<Consultation> listConsultation() {
		// TODO Auto-generated method stub
		return consultrep.findAll();
	}

	

}
