package com.quicklinker.pfa.service;

import java.util.List;

import com.quicklinker.pfa.model.CompteModel;

public interface CompteService {
	
	public CompteModel ajouterCompte (CompteModel p);
	
	 List <CompteModel> getCompte();
	 
	 void  modifierCompte(CompteModel p);
	 
	 public void SupprimerCompte(int id);

}
