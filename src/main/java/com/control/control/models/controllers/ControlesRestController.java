/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.control.control.models.controllers;

import com.control.control.models.entity.Controles;
import com.control.control.models.services.IPersonasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    private IPersonasService personaService;
    
    @Secured({"ROLE_ADMIN","ROLE_USER"})
    @GetMapping("/controles/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Controles mostrarControl(@PathVariable Long id){
        return personaService.findControlById(id);
    }
    
    @Secured({"ROLE_ADMIN"})
    @DeleteMapping("/controles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Long id){
        personaService.deleteControlById(id);
    }
    
    @Secured({"ROLE_ADMIN"})
    @PostMapping("/controles")
    @ResponseStatus(HttpStatus.CREATED)
    public Controles nuevoControl(@RequestBody Controles control){
        return personaService.saveControl(control);
    }
    
}
