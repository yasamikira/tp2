package org.rim.tp2.controller;

import org.rim.tp2.domain.Chauffeur;
import org.rim.tp2.domain.assembler.chauffeurAssembler;
import org.rim.tp2.domain.vo.chauffeurVO;
import org.rim.tp2.domain.vo.createChauffeurVO;
import org.rim.tp2.domain.vo.updateChauffeurVO;
import org.rim.tp2.service.chauffeurService;
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
@RequestMapping("/chauffeur")
public class chauffeurController {

	@Autowired
    private chauffeurAssembler chauffeurAssembler;
 
    @Autowired
    private chauffeurService chauffeurService;
 
    //@ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public chauffeurVO getchauffeur(@PathVariable("id") Long id) {
        return chauffeurAssembler.tochauffeurVO(chauffeurService.getChauffeurById(id));
    }
 
    @PostMapping
    public chauffeurVO createchauffeur(@RequestBody createChauffeurVO userVO) {
        Chauffeur g = chauffeurAssembler.tochauffeur(userVO);
        Chauffeur savedchauffeur = chauffeurService.createChauffeur(g);
        return chauffeurAssembler.tochauffeurVO(savedchauffeur);
    }
 
    @PutMapping
    public chauffeurVO updatechauffeur(@RequestBody updateChauffeurVO updatechauffeurVO) {
        Chauffeur g = chauffeurAssembler.tochauffeur(updatechauffeurVO);
        Chauffeur updatedchauffeur = chauffeurService.updateChauffeur(g);
        return chauffeurAssembler.tochauffeurVO(g);
    }
 
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        chauffeurService.deleteChauffeur(id);
    }
}
