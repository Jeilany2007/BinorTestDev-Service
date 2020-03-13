package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.dao.ConsultationRepository;
import com.example.entities.Consultation;

@SpringBootApplication
public class BinorTestDevApplication  implements CommandLineRunner{
	
	@Autowired
	private ConsultationRepository etatCivilRepository;
	public static void main(String[] args) {
		SpringApplication.run(BinorTestDevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * etatCivilRepository.save(new
		 * Consultation("Jeilany","MoahmedBouya",df.parse("31/01/1990"),"H","jilo.jpg"))
		 * ; etatCivilRepository.findAll().forEach(c->{
		 * System.out.println(c.toString()); });
		 */			
	}

}
