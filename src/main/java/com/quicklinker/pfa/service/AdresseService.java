package com.quicklinker.pfa.service;

import java.util.List;

import com.quicklinker.pfa.model.AdresseModel;

public interface AdresseService {
	
	public AdresseModel ajouterAdresse (AdresseModel p);
	
	 List <AdresseModel> getAdresse();
	 
	 void  modifierAdresse(AdresseModel p);
	 
	 public void SupprimerAdresse(int id);

}
