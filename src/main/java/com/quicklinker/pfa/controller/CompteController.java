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

import com.quicklinker.pfa.model.CompteModel;
import com.quicklinker.pfa.service.CompteService;

@RestController
@RequestMapping ("/comptes")
@CrossOrigin(origins = "http://localhost:3000")
public class CompteController {
	@Autowired
	private CompteService compteService;
	
	@PostMapping("/ajouter")
	public CompteModel ajouterCompte(@RequestBody CompteModel cpt)
	{
		return compteService.ajouterCompte(cpt);
	}
	
	 @GetMapping("/liste")
	public List <CompteModel>getCompte()
	{
		return compteService.getCompte();
	}
	
	@PutMapping
	
	void  modifierCompte(@RequestBody CompteModel cpt)
	{
		 compteService.modifierCompte(cpt);
	}
	
	@DeleteMapping ("/{id}")
	public void supprimer(@PathVariable int id) {
	
		compteService.SupprimerCompte(id);

	}
	
	

}
