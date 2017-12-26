package org.rim.tp2.service;

import org.rim.tp2.domain.vo.ChauffeurVO;
import org.rim.tp2.domain.vo.CreateChauffeurVO;
import org.rim.tp2.domain.vo.UpdateChauffeurVO;

public interface ChauffeurService {
	
	 	ChauffeurVO getChauffeurById(Long id);
	 	
	 	ChauffeurVO createChauffeur(CreateChauffeurVO chauffeur);
	 	
	 	ChauffeurVO updateChauffeur(UpdateChauffeurVO chauffeur);
	 	
	 	ChauffeurVO deleteChauffeur(Long id);

}
