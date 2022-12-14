/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.control.control.models.controllers;

import com.control.control.models.entity.Controles;
import com.control.control.models.services.IControlesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Beatriz
 */
@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class ControlesRestController {
    
    @Autowired
    private IControlesService controlesService;
    
    @Secured("ROLE_ADMIN")
    @GetMapping("/controles")
    public List<Controles> listarControles(){
        return controlesService.findAll();
    }
    
    @Secured("ROLE_ADMIN")
    @GetMapping("/controles/{id}")
    public Controles mostrarControl(@PathVariable Long id){
        return controlesService.findById(id);
    }
    
    @Secured("ROLE_ADMIN")
    @PostMapping("/controles")
    public Controles nuevoControl(@RequestBody Controles control){
        return controlesService.save(control);
    }
    
    @Secured("ROLE_ADMIN")
    @PutMapping("controles/{id}")
    public Controles modificarControl(@RequestBody Controles control,@PathVariable Long id){
        Controles controlActual = controlesService.findById(id);
        
        controlActual.setPeso(control.getPeso());
        controlActual.setCalorias(control.getCalorias());
        controlActual.setEdad_metabolica(control.getEdad_metabolica());
        controlActual.setFecha(control.getFecha());
        controlActual.setImc(control.getImc());
        controlActual.setGrasa(control.getGrasa());
        controlActual.setMusculo(control.getMusculo());
        controlActual.setVisceral(control.getVisceral());
        
        return controlesService.save(controlActual);
    }
    
    @Secured("ROLE_ADMIN")
    @DeleteMapping("/controles/{id}")
    public void eliminarControl(@PathVariable Long id){
        controlesService.delete(id);
    }
}
