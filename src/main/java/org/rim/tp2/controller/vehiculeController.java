package org.rim.tp2.controller;

import java.util.List;

import org.rim.tp2.domain.vo.CreateVehiculeVO;
import org.rim.tp2.domain.vo.UpdateVehiculeVO;
import org.rim.tp2.domain.vo.VehiculeVO;
import org.rim.tp2.service.VehiculeService;
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
@RequestMapping("/vehicule")
/*allow acces to controller*/
@CrossOrigin
public class VehiculeController {

//	@Autowired
//    private VehiculeAssembler vehiculeAssembler;
 
    @Autowired
    private VehiculeService vehiculeService;
 
    @GetMapping("/all")
    public List<VehiculeVO> getvehicules() {
    	return vehiculeService.getAll();
    }
    
    //@ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public VehiculeVO getvehicule(@PathVariable("id") Long id) {
        //return vehiculeAssembler.tovehiculeVO(vehiculeService.getVehiculeById(id));
    	return vehiculeService.getVehiculeById(id);
    }
 
    @PostMapping
    public VehiculeVO createvehicule(@RequestBody CreateVehiculeVO v) {
        //Vehicule g = vehiculeAssembler.tovehicule(userVO);
        //Vehicule savedvehicule = vehiculeService.createVehicule(userVO);
        return vehiculeService.createVehicule(v);//vehiculeAssembler.tovehiculeVO(savedvehicule);
    }
 
    @PutMapping
    public VehiculeVO updatevehicule(@RequestBody UpdateVehiculeVO v) {
       // Vehicule g = vehiculeAssembler.tovehicule(updatevehiculeVO);
        //Vehicule updatedvehicule = vehiculeService.UpdateVehicule(g);
        return vehiculeService.updateVehicule(v);
    }
 
    @DeleteMapping("/{id}")
    public VehiculeVO delete(@PathVariable("id") Long id) {
       return vehiculeService.deleteVehicule(id);
    }
}
