package com.api.crecoscorp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crecoscorp.models.PersonaModel;
import com.api.crecoscorp.repositories.IPersonaRepository;

@Service
public class PersonaService {
    
    @Autowired
    IPersonaRepository personaRepository;

    public Optional<PersonaModel> getSolicitanteByIdentificacion(String identificacion){
        return personaRepository.getSolicitanteByIdentificacion(identificacion); 
    }

    public Optional<PersonaModel> getSolicitanteByCelular(String celular){
        return personaRepository.getSolicitanteByCelular(celular); 
    }

    public Optional<PersonaModel> getSolicitanteByEmail(String email){
        return personaRepository.getSolicitanteByEmail(email); 
    }
}
