package com.quicklinker.pfa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicklinker.pfa.model.ProfilModel;
import com.quicklinker.pfa.repository.ProfilRepository;

@Service
public class ProfilServiceImpl implements ProfilService {

	@Autowired
	ProfilRepository profilRepository;
	
	@Override
	public ProfilModel ajouterProfil(ProfilModel p) {
		// TODO Auto-generated method stub
		return profilRepository.save(p);
	}

	@Override
	public List<ProfilModel> getProfil() {
		// TODO Auto-generated method stub
		return profilRepository.findAll();
	}

	@Override
	public void modifierProfil(ProfilModel p) {
		// TODO Auto-generated method stub
		
    Optional<ProfilModel> r= profilRepository.findById(p.getId());
		
		if(r.isPresent())
		{
			ProfilModel c= r.get();
			c.setNom(p.getNom());
			c.setPrenom(p.getPrenom());
			c.setEmail(p.getEmail());
			c.setDdn(p.getDdn());
			c.setAge(p.getAge());
			c.setTel(p.getTel());
			profilRepository.save(c);
			
		}
		
	}

	@Override
	public void SupprimerProfil(int id) {
		// TODO Auto-generated method stub
		profilRepository.deleteById(id);
		
	}

}
