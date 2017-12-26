package org.rim.tp2.controller;

import org.rim.tp2.domain.Groupe;
import org.rim.tp2.domain.assembler.groupeAssembler;
import org.rim.tp2.domain.vo.createGroupeVO;
import org.rim.tp2.domain.vo.groupeVO;
import org.rim.tp2.domain.vo.updateGroupeVO;
import org.rim.tp2.service.groupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groupe")
public class groupeController {
	@Autowired
    private groupeAssembler groupeAssembler;
 
    @Autowired
    private groupeService groupeService;
 
    //@ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public groupeVO getgroupe(@PathVariable("id") Long id) {
        return groupeAssembler.togroupeVO(groupeService.getGroupeById(id));
    }
 
    @PostMapping
    public groupeVO creategroupe(@RequestBody createGroupeVO userVO) {
        Groupe g = groupeAssembler.togroupe(userVO);
        Groupe savedgroupe = groupeService.createGroupe(g);
        return groupeAssembler.togroupeVO(savedgroupe);
    }
 
    @PutMapping
    public groupeVO updategroupe(@RequestBody updateGroupeVO updategroupeVO) {
        Groupe g = groupeAssembler.togroupe(updategroupeVO);
        Groupe updatedgroupe = groupeService.updateGroupe(g);
        return groupeAssembler.togroupeVO(g);
    }
 
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        groupeService.deleteGroupe(id);
    }
}
