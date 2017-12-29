package org.rim.tp2.service;

import java.util.List;

import org.rim.tp2.domain.vo.CreateGroupeVO;
import org.rim.tp2.domain.vo.GroupeVO;
import org.rim.tp2.domain.vo.UpdateGroupeVO;

public interface GroupeService {
	
	GroupeVO getGroupeById(Long id);
 	
	GroupeVO createGroupe(CreateGroupeVO g);
 	
	GroupeVO updateGroupe(UpdateGroupeVO g);
 	
	GroupeVO deleteGroupe(Long id);

	List<GroupeVO> getAll();

}
