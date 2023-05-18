package com.quicklinker.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quicklinker.pfa.model.AdresseModel;
import com.quicklinker.pfa.service.AdresseService;

@RestController
@RequestMapping ("/adresse")
@CrossOrigin
public class AdresseController {
	
	@Autowired	
	AdresseService adresseService;
	
	@PostMapping
	public AdresseModel ajouterAdresse(@RequestBody AdresseModel adr)
	{
		return adresseService.ajouterAdresse(adr);
	}
	
	@GetMapping
	public List <AdresseModel>getAdresse()
	{
		return adresseService.getAdresse();
	}
	
	@PutMapping
	
	void  modifierAdresse(@RequestBody AdresseModel adr)
	{
		adresseService.modifierAdresse(adr);
	}
	
	@DeleteMapping ("/{id}")
	public void supprimer(@PathVariable int id) {
	
		adresseService.SupprimerAdresse(id);

	}
	

}
