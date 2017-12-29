package org.rim.tp2.service.impl;

import org.rim.tp2.domain.GroupeVehicule;
import org.rim.tp2.domain.repo.GroupeVehiculeRepository;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.GroupeVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupeVehiculeServiceImpl implements GroupeVehiculeService {

	/**
	 * doing CRUD by using repository
	 * */
	@Autowired
	private GroupeVehiculeRepository repository;
	
	public GroupeVehicule getGroupeVehiculeById(Long id) {
		GroupeVehicule gv= repository.findOne(id);
    	if (gv == null) {
            throw new ResourceNotFoundException(id, "combineson introuvable");
        }
    	return gv;
	}

	public GroupeVehicule createGroupeVehicule(GroupeVehicule g) {
		return repository.save(g);
	}

	public GroupeVehicule updateGroupeVehicule(GroupeVehicule g) {
		 return repository.save(g);
	}

	public void deleteGroupeVehicule(Long id) {
			GroupeVehicule gv=repository.findOne(id);
				if(gv != null)
					repository.delete(gv);
	}

}
