package org.rim.tp2.service.impl;

import org.rim.tp2.domain.Groupe;
import org.rim.tp2.domain.assembler.GroupeAssembler;
import org.rim.tp2.domain.repo.GroupeRepository;
import org.rim.tp2.domain.vo.CreateGroupeVO;
import org.rim.tp2.domain.vo.GroupeVO;
import org.rim.tp2.domain.vo.UpdateGroupeVO;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupeServiceImpl implements GroupeService {

	@Autowired
	private GroupeRepository repository;
	@Autowired
	private GroupeAssembler assembler;
	
	public GroupeVO getGroupeById(Long id) {
		Groupe g= repository.findOne(id);
    	if (g == null) {
            throw new ResourceNotFoundException(id, "group not found");
        }
    	return assembler.togroupeVO(g);
	}

	public GroupeVO createGroupe(CreateGroupeVO g) {
		return assembler.togroupeVO(repository.save(assembler.togroupe(g)));
	}

	public GroupeVO updateGroupe(UpdateGroupeVO g) {
		return assembler.togroupeVO(repository.save(assembler.togroupe(g)));
	}

	public GroupeVO deleteGroupe(Long id) {
		Groupe g=repository.getOne(id);
			if(g!=null)
				repository.delete(g);
			return g!=null? assembler.togroupeVO(g):null;

	}

}
