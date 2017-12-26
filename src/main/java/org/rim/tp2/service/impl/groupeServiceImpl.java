package org.rim.tp2.service.impl;

import org.rim.tp2.domain.Groupe;
import org.rim.tp2.domain.repo.groupeRepository;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.groupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class groupeServiceImpl implements groupeService {

	@Autowired
	private groupeRepository repository;
	
	public Groupe getGroupeById(Long id) {
		Groupe g= repository.findOne(id);
    	if (g == null) {
            throw new ResourceNotFoundException(id, "group not found");
        }
    	return g;
	}

	public Groupe createGroupe(Groupe g) {
		return repository.save(g);
	}

	public Groupe updateGroupe(Groupe g) {
		return repository.save(g);
	}

	public void deleteGroupe(Long id) {
		Groupe g=repository.getOne(id);
			if(g!=null)
				repository.delete(g);

	}

}
