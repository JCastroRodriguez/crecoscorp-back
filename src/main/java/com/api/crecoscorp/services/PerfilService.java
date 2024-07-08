package com.api.crecoscorp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crecoscorp.context.PerfilContext;
import com.api.crecoscorp.models.PerfilModel;
import com.api.crecoscorp.repositories.IPerfilRepository;

@Service
public class PerfilService {
    
    @Autowired
    IPerfilRepository perfilRepository;

    public List<PerfilContext> getPerfilAll(){
        return perfilRepository.getPerfilAll(); 
    }

    public Optional<PerfilModel> getPerfilById(Long id){
        return perfilRepository.findById(id);
    }   

    public PerfilModel postCrearPerfil(PerfilModel perfil){
        return perfilRepository.save(perfil);
    }

    public PerfilModel putActualizarPerfil(PerfilModel perfil){
        return perfilRepository.save(perfil);
    }
}
