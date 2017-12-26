package org.rim.tp2.service.impl;

import org.rim.tp2.domain.Chauffeur;
import org.rim.tp2.domain.assembler.ChauffeurAssembler;
import org.rim.tp2.domain.repo.ChauffeurRepository;
import org.rim.tp2.domain.vo.ChauffeurVO;
import org.rim.tp2.domain.vo.CreateChauffeurVO;
import org.rim.tp2.domain.vo.UpdateChauffeurVO;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.ChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChauffeurServiceImpl implements ChauffeurService {

	@Autowired
	private ChauffeurRepository repository;
	@Autowired
	private ChauffeurAssembler assembler;
	
	public ChauffeurVO getChauffeurById(Long id) {
		Chauffeur user= repository.findOne(id);
    	if (user == null) {
            throw new ResourceNotFoundException(id, "driver not found");
        }
    	return assembler.tochauffeurVO(user);
	}

	public ChauffeurVO createChauffeur(CreateChauffeurVO chauffeur) {
		return assembler.tochauffeurVO(repository.save(assembler.tochauffeur(chauffeur)));
	}

	public ChauffeurVO updateChauffeur(UpdateChauffeurVO chauffeur) {
		return assembler.tochauffeurVO(repository.save(assembler.tochauffeur(chauffeur)));
	}

	public ChauffeurVO deleteChauffeur(Long id) {
		Chauffeur c = repository.getOne(id);
			if(c!=null)
				repository.delete(c);
			return c!=null?assembler.tochauffeurVO(c):null;
	}

}
