package org.rim.tp2.controller;

import java.util.List;

import org.rim.tp2.domain.vo.CreateGroupeVO;
import org.rim.tp2.domain.vo.GroupeVO;
import org.rim.tp2.domain.vo.UpdateGroupeVO;
import org.rim.tp2.domain.vo.VehiculeVO;
import org.rim.tp2.service.GroupeService;
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
@RequestMapping("/groupe")
/*allow acces to controller*/
@CrossOrigin
public class GroupeController {
//	@Autowired
//    private GroupeAssembler groupeAssembler;
// 
    @Autowired
    private GroupeService groupeService;
 
    @GetMapping("/all")
    public List<GroupeVO> getgroupes() {
    	return groupeService.getAll();
    }
    
    //@ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public GroupeVO getgroupe(@PathVariable("id") Long id) {
        //return groupeAssembler.togroupeVO(groupeService.getGroupeById(id));
    	return groupeService.getGroupeById(id);
    }
 
    @PostMapping
    public GroupeVO creategroupe(@RequestBody CreateGroupeVO g) {
//        Groupe g = groupeAssembler.togroupe(userVO);
//        Groupe savedgroupe = groupeService.createGroupe(g);
        return groupeService.createGroupe(g);
    }
 
    @PutMapping
    public GroupeVO updategroupe(@RequestBody UpdateGroupeVO u) {
//        Groupe g = groupeAssembler.togroupe(updategroupeVO);
//        Groupe updatedgroupe = groupeService.updateGroupe(g);
        return groupeService.updateGroupe(u);
    }
 
    @DeleteMapping("/{id}")
    public GroupeVO delete(@PathVariable("id") Long id) {
        return groupeService.deleteGroupe(id);
    }
}
