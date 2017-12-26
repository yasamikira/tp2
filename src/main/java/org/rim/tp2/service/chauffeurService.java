package org.rim.tp2.service;

import org.rim.tp2.domain.Chauffeur;

public interface chauffeurService {
	
	 	Chauffeur getChauffeurById(Long id);
	 	
	 	Chauffeur createChauffeur(Chauffeur chauffeur);
	 	
	 	Chauffeur updateChauffeur(Chauffeur chauffeur);
	 	
	    void deleteChauffeur(Long id);

}
