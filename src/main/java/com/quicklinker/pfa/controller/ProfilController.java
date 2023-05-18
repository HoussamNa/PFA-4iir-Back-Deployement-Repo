package com.quicklinker.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quicklinker.pfa.model.ProfilModel;
import com.quicklinker.pfa.service.ProfilService;

@RestController
@RequestMapping ("/profils")
@CrossOrigin(origins = "http://localhost:3000")
public class ProfilController {
	@Autowired
	private ProfilService profilService;
	
	@PostMapping("/ajouter")
	public ProfilModel ajouterProfil(@RequestBody ProfilModel cpt)
	{
		return profilService.ajouterProfil(cpt);
	}
	
	@GetMapping("/liste")
	public List <ProfilModel>getProfil()
	{
		
		return profilService.getProfil();
	}
	
	@PutMapping
	
	void  modifierProfil(@RequestBody ProfilModel cpt)
	{
		
		profilService.modifierProfil(cpt);
	}

}
