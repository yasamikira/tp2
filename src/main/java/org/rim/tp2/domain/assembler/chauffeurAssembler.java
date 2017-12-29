package org.rim.tp2.domain.assembler;

import java.util.ArrayList;
import java.util.List;

import org.rim.tp2.domain.Chauffeur;
import org.rim.tp2.domain.vo.ChauffeurVO;
import org.rim.tp2.domain.vo.CreateChauffeurVO;
import org.rim.tp2.domain.vo.UpdateChauffeurVO;
import org.springframework.stereotype.Component;

@Component//synglton par defaut
//@Scope("prototype")
public class ChauffeurAssembler {

	/**
     * CreatechauffeurVO convert to chauffeur.
     *
     * @param createchauffeurVO
     * @return
     */
    public Chauffeur tochauffeur(CreateChauffeurVO createchauffeurVO) {
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
    public ChauffeurVO tochauffeurVO(Chauffeur chauffeur) {
        ChauffeurVO chauffeurVO = new ChauffeurVO();
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
    public Chauffeur tochauffeur(UpdateChauffeurVO updatechauffeurVO) {
        Chauffeur chauffeur = new Chauffeur();
        chauffeur.setId(updatechauffeurVO.getId());
        chauffeur.setFname(updatechauffeurVO.getFname());
        chauffeur.setLname(updatechauffeurVO.getLname());
        chauffeur.setDateN(updatechauffeurVO.getDateN());
        chauffeur.setRef(updatechauffeurVO.getRef());
        
        return chauffeur;
    }

    /*
     * convert list or chauffeur to chauffeurVO
     * */
	public List<ChauffeurVO> tochauffeurVOs(List<Chauffeur> findAll) {
		List<ChauffeurVO> l=new ArrayList<ChauffeurVO>();
		for (Chauffeur chauffeur : findAll) {
			l.add(tochauffeurVO(chauffeur));
		}
		return l;
	}
}
