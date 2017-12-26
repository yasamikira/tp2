package org.rim.tp2.service.impl;

import org.rim.tp2.domain.AffectationVc;
import org.rim.tp2.domain.repo.AffectationVCRepository;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.affectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class affectationVCServiceImpl implements affectationService {

	@Autowired
	private AffectationVCRepository repository;
	
	public AffectationVc getAffectationById(Long id) {
		AffectationVc a = repository.findOne(id);
		if(a == null)
			throw new ResourceNotFoundException(id,"affectation introuvable");
		return a;
	}

	public AffectationVc createAffectation(AffectationVc g) {
		return repository.save(g);
	}

	public AffectationVc updateAffectation(AffectationVc g) {
		return repository.save(g);
	}

	public void deleteAffectation(Long id) {
			AffectationVc a = repository.getOne(id);
				if(a!= null)
					repository.delete(a);
	}

}
