package org.rim.tp2.service.impl;

import org.rim.tp2.domain.Chauffeur;
import org.rim.tp2.domain.repo.chauffeurRepository;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.chauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chauffeurServiceImpl implements chauffeurService {

	@Autowired
	private chauffeurRepository repository;
	
	public Chauffeur getChauffeurById(Long id) {
		Chauffeur user= repository.findOne(id);
    	if (user == null) {
            throw new ResourceNotFoundException(id, "driver not found");
        }
    	return user;
	}

	public Chauffeur createChauffeur(Chauffeur chauffeur) {
		return repository.save(chauffeur);
	}

	public Chauffeur updateChauffeur(Chauffeur chauffeur) {
		return repository.save(chauffeur);
	}

	public void deleteChauffeur(Long id) {
		Chauffeur c = repository.getOne(id);
			if(c!=null)
				repository.delete(c);
	}

}
