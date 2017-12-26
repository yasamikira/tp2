package org.rim.tp2.controller;

import org.rim.tp2.domain.Vehicule;
import org.rim.tp2.domain.assembler.vehiculeAssembler;
import org.rim.tp2.domain.vo.createVehiculeVO;
import org.rim.tp2.domain.vo.updateVehiculeVO;
import org.rim.tp2.domain.vo.vehiculeVO;
import org.rim.tp2.service.vehiculeService;
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
@RequestMapping("/vehicule")
public class vehiculeController {

	@Autowired
    private vehiculeAssembler vehiculeAssembler;
 
    @Autowired
    private vehiculeService vehiculeService;
 
    //@ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public vehiculeVO getvehicule(@PathVariable("id") Long id) {
        return vehiculeAssembler.tovehiculeVO(vehiculeService.getVehiculeById(id));
    }
 
    @PostMapping
    public vehiculeVO createvehicule(@RequestBody createVehiculeVO userVO) {
        Vehicule g = vehiculeAssembler.tovehicule(userVO);
        Vehicule savedvehicule = vehiculeService.createVehicule(g);
        return vehiculeAssembler.tovehiculeVO(savedvehicule);
    }
 
    @PutMapping
    public vehiculeVO updatevehicule(@RequestBody updateVehiculeVO updatevehiculeVO) {
        Vehicule g = vehiculeAssembler.tovehicule(updatevehiculeVO);
        Vehicule updatedvehicule = vehiculeService.updateVehicule(g);
        return vehiculeAssembler.tovehiculeVO(g);
    }
 
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        vehiculeService.deleteVehicule(id);
    }
}
