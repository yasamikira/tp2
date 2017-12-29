package org.rim.tp2.service.impl;

import java.util.List;

import org.rim.tp2.domain.Vehicule;
import org.rim.tp2.domain.assembler.VehiculeAssembler;
import org.rim.tp2.domain.repo.VehiculeRepository;
import org.rim.tp2.domain.vo.CreateVehiculeVO;
import org.rim.tp2.domain.vo.UpdateVehiculeVO;
import org.rim.tp2.domain.vo.VehiculeVO;
import org.rim.tp2.exception.ResourceNotFoundException;
import org.rim.tp2.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeServiceImpl implements VehiculeService {

	/**
	 * doing CRUD by using repository
	 * */
	@Autowired
	private VehiculeRepository repository; 
	@Autowired
	private VehiculeAssembler assembler; 
	
	/**
	 * return object with id passed on parametre 
	 * */
	public VehiculeVO getVehiculeById(Long id) {
		Vehicule v= repository.findOne(id);
    	if (v == null) {
            throw new ResourceNotFoundException(id, "vehicule introuvable");
        }
    	return assembler.tovehiculeVO(v);
	}

	/**
	 * create object 
	 * **/

	public VehiculeVO createVehicule(CreateVehiculeVO g) {
		return assembler.tovehiculeVO(repository.save(assembler.tovehicule(g)));
	}

	/**
	 * update object 
	 * */
	
	public VehiculeVO updateVehicule(UpdateVehiculeVO g) {
		return assembler.tovehiculeVO(repository.save(assembler.tovehicule(g)));
	}

	/**
	 * delete object
	 * */
	public VehiculeVO deleteVehicule(Long id) {
			Vehicule v=repository.getOne(id);
			if(v!=null)
				repository.delete(v);
			return v!=null ? assembler.tovehiculeVO(v):null;
	}

	/**
	 * get all objects
	 * */
	
	public List<VehiculeVO> getAll() {
		
		return assembler.tovehiculeVOs( repository.findAll());
	}

	

}
