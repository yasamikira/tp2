package org.rim.tp2.domain.assembler;

import org.rim.tp2.domain.Groupe;
import org.rim.tp2.domain.vo.CreateGroupeVO;
import org.rim.tp2.domain.vo.GroupeVO;
import org.rim.tp2.domain.vo.UpdateGroupeVO;
import org.springframework.stereotype.Component;

@Component//synglton par defaut
//@Scope("prototype")
public class GroupeAssembler {

	/**
     * CreategroupeVO convert to groupe.
     *
     * @param creategroupeVO
     * @return
     */
    public Groupe togroupe(CreateGroupeVO creategroupeVO) {
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
    public GroupeVO togroupeVO(Groupe groupe) {
        GroupeVO groupeVO = new GroupeVO();
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
    public Groupe togroupe(UpdateGroupeVO updategroupeVO) {
        Groupe groupe = new Groupe();
        groupe.setId(updategroupeVO.getId());
        groupe.setNom(updategroupeVO.getNom());
        
        return groupe;
    }
}
