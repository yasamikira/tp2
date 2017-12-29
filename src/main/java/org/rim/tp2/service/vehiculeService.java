package org.rim.tp2.service;

import java.util.List;

import org.rim.tp2.domain.vo.CreateVehiculeVO;
import org.rim.tp2.domain.vo.UpdateVehiculeVO;
import org.rim.tp2.domain.vo.VehiculeVO;

public interface VehiculeService {

	VehiculeVO getVehiculeById(Long id);
 	
	VehiculeVO createVehicule(CreateVehiculeVO g);
 	
	VehiculeVO updateVehicule(UpdateVehiculeVO  g);
 	
	VehiculeVO deleteVehicule(Long id);

	List<VehiculeVO> getAll();
}
