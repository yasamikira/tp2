package org.rim.tp2.controller;

import java.util.List;

import org.rim.tp2.domain.vo.ChauffeurVO;
import org.rim.tp2.domain.vo.CreateChauffeurVO;
import org.rim.tp2.domain.vo.UpdateChauffeurVO;
import org.rim.tp2.service.ChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chauffeur")
/*allow acces to controller*/
@CrossOrigin
public class ChauffeurController {

//	@Autowired
//    private ChauffeurAssembler chauffeurAssembler;
 
    @Autowired
    private ChauffeurService chauffeurService;
 
    @GetMapping("/all")
    public List<ChauffeurVO> getchauffeurs() {
    	return chauffeurService.getAll();
    }
    //@ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ChauffeurVO getchauffeur(@PathVariable("id") Long id) {
        //return chauffeurAssembler.tochauffeurVO(chauffeurService.getChauffeurById(id));
    	return chauffeurService.getChauffeurById(id);
    }
 
    @PostMapping
    public ChauffeurVO createchauffeur(@RequestBody CreateChauffeurVO g) {
//        Chauffeur g = chauffeurAssembler.tochauffeur(userVO);
//        Chauffeur savedchauffeur = chauffeurService.createChauffeur(g);
        return chauffeurService.createChauffeur(g);
    }
 
    @PutMapping
    public ChauffeurVO updatechauffeur(@RequestBody UpdateChauffeurVO g) {
//        Chauffeur g = chauffeurAssembler.tochauffeur(updatechauffeurVO);
//        Chauffeur updatedchauffeur = chauffeurService.updateChauffeur(g);
        return chauffeurService.updateChauffeur(g);
    }
 
    @DeleteMapping("/{id}")
    public ChauffeurVO delete(@PathVariable("id") Long id) {
        return chauffeurService.deleteChauffeur(id);
    }
}
