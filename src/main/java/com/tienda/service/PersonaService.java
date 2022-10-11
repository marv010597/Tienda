/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marvinjimenez
 */
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> listPerson() {
        
        return (List<Persona>)personaRepository.findAll();
        
    }
    
}
