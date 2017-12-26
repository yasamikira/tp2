package org.rim.tp2.service;

import org.rim.tp2.domain.AffectationVc;

public interface AffectationService {
	
	AffectationVc getAffectationById(Long id);
 	
	AffectationVc createAffectation(AffectationVc g);
 	
	AffectationVc updateAffectation(AffectationVc g);
 	
    void deleteAffectation(Long id);

}
