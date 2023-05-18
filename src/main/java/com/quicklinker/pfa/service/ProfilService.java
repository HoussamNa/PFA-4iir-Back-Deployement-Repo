package com.quicklinker.pfa.service;

import java.util.List;

import com.quicklinker.pfa.model.ProfilModel;

public interface ProfilService {
	
	public ProfilModel ajouterProfil (ProfilModel p);
	
	 List <ProfilModel> getProfil();
	 
	 void  modifierProfil(ProfilModel p);
	 
	 public void SupprimerProfil(int id);

}
