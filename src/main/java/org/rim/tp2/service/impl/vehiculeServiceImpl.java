package org.rim.tp2.service.impl;

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

	@Autowired
	private VehiculeRepository repository; 
	@Autowired
	private VehiculeAssembler assembler; 
	
	public VehiculeVO getVehiculeById(Long id) {
		Vehicule v= repository.findOne(id);
    	if (v == null) {
            throw new ResourceNotFoundException(id, "vehicule introuvable");
        }
    	return assembler.tovehiculeVO(v);
	}

	public VehiculeVO createVehicule(CreateVehiculeVO g) {
		return assembler.tovehiculeVO(repository.save(assembler.tovehicule(g)));
	}

	public VehiculeVO updateVehicule(UpdateVehiculeVO g) {
		return assembler.tovehiculeVO(repository.save(assembler.tovehicule(g)));
	}

	public VehiculeVO deleteVehicule(Long id) {
			Vehicule v=repository.getOne(id);
			if(v!=null)
				repository.delete(v);
			return v!=null ? assembler.tovehiculeVO(v):null;
	}

	

}
