package org.rim.tp2.service.impl;

import org.rim.tp2.domain.Vehicule;
import org.rim.tp2.domain.repo.vehiculeRepository;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.vehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vehiculeServiceImpl implements vehiculeService {

	@Autowired
	private vehiculeRepository repository; 
	
	public Vehicule getVehiculeById(Long id) {
		Vehicule v= repository.findOne(id);
    	if (v == null) {
            throw new ResourceNotFoundException(id, "vehicule introuvable");
        }
    	return v;
	}

	public Vehicule createVehicule(Vehicule g) {
		return repository.save(g);
	}

	public Vehicule updateVehicule(Vehicule g) {
		return repository.save(g);
	}

	public void deleteVehicule(Long id) {
			Vehicule v=repository.getOne(id);
			if(v!=null)
				repository.delete(v);
	}

}
