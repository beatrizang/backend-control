/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.control.control.models.services;

import com.control.control.models.dao.IControlesDao;
import com.control.control.models.entity.Controles;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Beatriz
 */
@Service
public class ControlesServiceImpl implements IControlesService{

    @Autowired
    private IControlesDao controlesDao;
    
    @Override
    public List<Controles> findAll() {
        return (List<Controles>)controlesDao.findAll();
    }

    @Override
    public Controles findById(Long id) {
        return controlesDao.findById(id).orElse(null);
    }

    @Override
    public Controles save(Controles control) {
        return controlesDao.save(control);
    }

    @Override
    public void delete(Long id) {
        controlesDao.deleteById(id);
    }
    
}
