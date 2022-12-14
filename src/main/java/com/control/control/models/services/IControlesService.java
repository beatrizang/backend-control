/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.control.control.models.services;

import com.control.control.models.entity.Controles;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public interface IControlesService {
    
    public List<Controles> findAll();
    
    public Controles findById(Long id);
    
    public Controles save(Controles control);
    
    public void delete(Long id);
}
