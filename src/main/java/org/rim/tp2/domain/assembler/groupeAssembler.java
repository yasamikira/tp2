package org.rim.tp2.domain.assembler;

import org.rim.tp2.domain.Groupe;
import org.rim.tp2.domain.vo.createGroupeVO;
import org.rim.tp2.domain.vo.groupeVO;
import org.rim.tp2.domain.vo.updateGroupeVO;
import org.springframework.stereotype.Component;

@Component//synglton par defaut
//@Scope("prototype")
public class groupeAssembler {

	/**
     * CreategroupeVO convert to groupe.
     *
     * @param creategroupeVO
     * @return
     */
    public Groupe togroupe(createGroupeVO creategroupeVO) {
        Groupe groupe = new Groupe();
        groupe.setNom(creategroupeVO.getNom());
        
        return groupe;
    }


    /**
     * groupe to groupeVO.
     *
     * @param groupe
     * @return
     */
    public groupeVO togroupeVO(Groupe groupe) {
        groupeVO groupeVO = new groupeVO();
        groupeVO.setGroupeId(groupe.getId());
        groupeVO.setNom(groupe.getNom());
        groupeVO.setCreated(groupe.getCreated());
        groupeVO.setUpdated(groupe.getUpdated());
        
        return groupeVO;

    }

    /**
     * UpdategroupeVO to groupe.
     *
     * @param updategroupeVO
     * @return
     */
    public Groupe togroupe(updateGroupeVO updategroupeVO) {
        Groupe groupe = new Groupe();
        groupe.setId(updategroupeVO.getId());
        groupe.setNom(updategroupeVO.getNom());
        
        return groupe;
    }
}
