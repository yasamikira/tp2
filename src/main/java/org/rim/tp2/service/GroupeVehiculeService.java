package org.rim.tp2.service;

import org.rim.tp2.domain.GroupeVehicule;

public interface GroupeVehiculeService {
	
	GroupeVehicule getGroupeVehiculeById(Long id);
 	
	GroupeVehicule createGroupeVehicule(GroupeVehicule g);
 	
	GroupeVehicule updateGroupeVehicule(GroupeVehicule g);
 	
    void deleteGroupeVehicule(Long id);

}
