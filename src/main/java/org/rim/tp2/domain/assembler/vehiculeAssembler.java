package org.rim.tp2.domain.assembler;

import org.rim.tp2.domain.Vehicule;
import org.rim.tp2.domain.vo.createVehiculeVO;
import org.rim.tp2.domain.vo.updateVehiculeVO;
import org.rim.tp2.domain.vo.vehiculeVO;
import org.springframework.stereotype.Component;

@Component//synglton par defaut
//@Scope("prototype")
public class vehiculeAssembler {

	/**
     * CreatevehiculeVO convert to vehicule.
     *
     * @param createvehiculeVO
     * @return
     */
    public Vehicule tovehicule(createVehiculeVO createvehiculeVO) {
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
    public vehiculeVO tovehiculeVO(Vehicule vehicule) {
        vehiculeVO vehiculeVO = new vehiculeVO();
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
    public Vehicule tovehicule(updateVehiculeVO updatevehiculeVO) {
        Vehicule vehicule = new Vehicule();
        vehicule.setId(updatevehiculeVO.getId());
        vehicule.setPoids(updatevehiculeVO.getPoids());
        vehicule.setMarque(updatevehiculeVO.getMarque());
        
        return vehicule;
    }
}
