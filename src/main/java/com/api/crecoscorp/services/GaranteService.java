package com.api.crecoscorp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crecoscorp.models.GaranteModel;
import com.api.crecoscorp.repositories.IGaranteRepository;

@Service
public class GaranteService {
    
    @Autowired
    IGaranteRepository garanteRepository;

    public Optional<GaranteModel> getGaranteByIdentificacion(String identificacion){
        return garanteRepository.getGaranteByIdentificacion(identificacion); 
    }

    public Optional<GaranteModel> getGaranteByCelular(String celular){
        return garanteRepository.getGaranteByCelular(celular); 
    }
}
