package com.quicklinker.pfa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicklinker.pfa.model.CompteModel;
import com.quicklinker.pfa.repository.CompteRepository;
@Service
public class CompteServiceImpl implements CompteService {
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public CompteModel ajouterCompte(CompteModel p) {
		return compteRepository.save(p);
	}

	@Override
	public List<CompteModel> getCompte() {
		// TODO Auto-generated method stub
		return compteRepository.findAll() ;
	}

	
	@Override
	public void SupprimerCompte(int id) {
		// TODO Auto-generated method stub
		//return compteRepository.delete(p);
		compteRepository.deleteById(id);
		
	}

	@Override
	public void modifierCompte(CompteModel p) {
		// TODO Auto-generated method stub
		Optional<CompteModel> r= compteRepository.findById(p.getId());
		
		if(r.isPresent())
		{
			CompteModel c= r.get();
			c.setEmail(p.getEmail());
			c.setUsername(p.getUsername());
			c.setPassword(p.getPassword());
			compteRepository.save(c);
		}
		
		
		
	}

}
