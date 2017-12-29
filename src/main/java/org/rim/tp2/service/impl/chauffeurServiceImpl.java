package org.rim.tp2.service.impl;

import java.util.List;

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

	/**
	 * doing CRUD by using repository
	 * */
	@Autowired
	private ChauffeurRepository repository;
	@Autowired
	private ChauffeurAssembler assembler;
	
	/**
	 * return object with id passed on parametre 
	 * */
	public ChauffeurVO getChauffeurById(Long id) {
		Chauffeur user= repository.findOne(id);
    	if (user == null) {
            throw new ResourceNotFoundException(id, "driver not found");
        }
    	return assembler.tochauffeurVO(user);
	}
	
	/**
	 * create object 
	 * **/

	public ChauffeurVO createChauffeur(CreateChauffeurVO chauffeur) {
		return assembler.tochauffeurVO(repository.save(assembler.tochauffeur(chauffeur)));
	}

	/**
	 * update object 
	 * */
	public ChauffeurVO updateChauffeur(UpdateChauffeurVO chauffeur) {
		return assembler.tochauffeurVO(repository.save(assembler.tochauffeur(chauffeur)));
	}

	/**
	 * delete object 
	 * */
	public ChauffeurVO deleteChauffeur(Long id) {
		Chauffeur c = repository.getOne(id);
			if(c!=null)
				repository.delete(c);
			return c!=null?assembler.tochauffeurVO(c):null;
	}

	/**
	 * get all objects
	 * */
	public List<ChauffeurVO> getAll() {
		return assembler.tochauffeurVOs(repository.findAll());
	}

}
