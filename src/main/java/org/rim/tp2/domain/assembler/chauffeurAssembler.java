package org.rim.tp2.domain.assembler;

import org.rim.tp2.domain.Chauffeur;
import org.rim.tp2.domain.vo.chauffeurVO;
import org.rim.tp2.domain.vo.createChauffeurVO;
import org.rim.tp2.domain.vo.updateChauffeurVO;
import org.springframework.stereotype.Component;

@Component//synglton par defaut
//@Scope("prototype")
public class chauffeurAssembler {

	/**
     * CreatechauffeurVO convert to chauffeur.
     *
     * @param createchauffeurVO
     * @return
     */
    public Chauffeur tochauffeur(createChauffeurVO createchauffeurVO) {
        Chauffeur chauffeur = new Chauffeur();
        chauffeur.setFname(createchauffeurVO.getFname());
        chauffeur.setLname(createchauffeurVO.getLname());
        chauffeur.setDateN(createchauffeurVO.getDateN());
        chauffeur.setRef(createchauffeurVO.getRef());
        
        return chauffeur;
    }


    /**
     * chauffeur to chauffeurVO.
     *
     * @param chauffeur
     * @return
     */
    public chauffeurVO tochauffeurVO(Chauffeur chauffeur) {
        chauffeurVO chauffeurVO = new chauffeurVO();
        chauffeurVO.setChauffeurId(chauffeur.getId());
        chauffeurVO.setFname(chauffeur.getFname());
        chauffeurVO.setLname(chauffeur.getLname());
        chauffeurVO.setRef(chauffeur.getRef());
        chauffeurVO.setCreated(chauffeur.getCreated());
        chauffeurVO.setUpdated(chauffeur.getUpdated());
        
        return chauffeurVO;

    }

    /**
     * UpdatechauffeurVO to chauffeur.
     *
     * @param updatechauffeurVO
     * @return
     */
    public Chauffeur tochauffeur(updateChauffeurVO updatechauffeurVO) {
        Chauffeur chauffeur = new Chauffeur();
        chauffeur.setId(updatechauffeurVO.getId());
        chauffeur.setFname(updatechauffeurVO.getFname());
        chauffeur.setLname(updatechauffeurVO.getLname());
        chauffeur.setDateN(updatechauffeurVO.getDateN());
        chauffeur.setRef(updatechauffeurVO.getRef());
        
        return chauffeur;
    }
}
