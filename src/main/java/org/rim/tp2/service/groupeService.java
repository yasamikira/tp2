package org.rim.tp2.service;

import org.rim.tp2.domain.Groupe;

public interface groupeService {
	
	Groupe getGroupeById(Long id);
 	
	Groupe createGroupe(Groupe g);
 	
	Groupe updateGroupe(Groupe g);
 	
    void deleteGroupe(Long id);

}
