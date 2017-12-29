package org.rim.tp2.domain.assembler;

import java.util.ArrayList;
import java.util.List;

import org.rim.tp2.domain.Vehicule;
import org.rim.tp2.domain.vo.CreateVehiculeVO;
import org.rim.tp2.domain.vo.UpdateVehiculeVO;
import org.rim.tp2.domain.vo.VehiculeVO;
import org.springframework.stereotype.Component;

@Component//synglton par defaut
//@Scope("prototype")
public class VehiculeAssembler {

	/**
     * CreatevehiculeVO convert to vehicule.
     *
     * @param createvehiculeVO
     * @return
     */
    public Vehicule tovehicule(CreateVehiculeVO createvehiculeVO) {
        Vehicule vehicule = new Vehicule();
        vehicule.setPoids(createvehiculeVO.getPoids());
        vehicule.setMarque(createvehiculeVO.getMarque());
        vehicule.setCouleur(createvehiculeVO.getCouleur());
        
        return vehicule;
    }


    /**
     * vehicule to vehiculeVO.
     *
     * @param vehicule
     * @return
     */
    public VehiculeVO tovehiculeVO(Vehicule vehicule) {
        VehiculeVO vehiculeVO = new VehiculeVO();
        vehiculeVO.setVehiculeId(vehicule.getId());
        vehiculeVO.setPoids(vehicule.getPoids());
        vehiculeVO.setCouleur(vehicule.getCouleur());
        vehiculeVO.setMarque(vehicule.getMarque());
        vehiculeVO.setCreated(vehicule.getCreated());
        vehiculeVO.setUpdated(vehicule.getUpdated());
        
        return vehiculeVO;

    }

    /**
     * UpdatevehiculeVO to vehicule.
     *
     * @param updatevehiculeVO
     * @return
     */
    public Vehicule tovehicule(UpdateVehiculeVO updatevehiculeVO) {
        Vehicule vehicule = new Vehicule();
        vehicule.setId(updatevehiculeVO.getId());
        vehicule.setPoids(updatevehiculeVO.getPoids());
        vehicule.setMarque(updatevehiculeVO.getMarque());
        
        return vehicule;
    }

    /*
     * 
     * convert list of vehicule to list of vehiculeVO
     * */

	public List<VehiculeVO> tovehiculeVOs(List<Vehicule> findAll) {
		List<VehiculeVO> l=new ArrayList<VehiculeVO>(); 
		for (Vehicule vehicule : findAll) {
			l.add(tovehiculeVO(vehicule));
		}
		return l;
	}
}
