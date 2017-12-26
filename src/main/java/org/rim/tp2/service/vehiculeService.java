package org.rim.tp2.service;

import org.rim.tp2.domain.Vehicule;

public interface vehiculeService {

	Vehicule getVehiculeById(Long id);
 	
	Vehicule createVehicule(Vehicule g);
 	
	Vehicule updateVehicule(Vehicule  g);
 	
    void deleteVehicule(Long id);
}
