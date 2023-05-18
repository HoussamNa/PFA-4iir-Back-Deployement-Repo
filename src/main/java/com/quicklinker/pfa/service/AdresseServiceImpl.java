package com.quicklinker.pfa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicklinker.pfa.model.AdresseModel;
import com.quicklinker.pfa.repository.AdresseRepository;

@Service
public class AdresseServiceImpl implements AdresseService {
	
	@Autowired
	AdresseRepository adresseRepository;

	@Override
	public AdresseModel ajouterAdresse(AdresseModel p) {
		// TODO Auto-generated method stub
		return adresseRepository.save(p);
	}

	@Override
	public List<AdresseModel> getAdresse() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
		
	}

	@Override
	public void modifierAdresse(AdresseModel p) {
		// TODO Auto-generated method stub
		
		Optional<AdresseModel> r= adresseRepository.findById(p.getIdAdresse());
		
		if(r.isPresent())
		{
			AdresseModel c= r.get();
			
			
			c.setLocalisation(p.getLocalisation());
			c.setImage(p.getImage());		
			adresseRepository.save(c);
		}
		
	}

	@Override
	public void SupprimerAdresse(int id) {
		// TODO Auto-generated method stub
		
		adresseRepository.deleteById(id);
	}

}
