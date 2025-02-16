package com.api.crecoscorp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.crecoscorp.models.SubCatalogoModel;

import com.api.crecoscorp.repositories.ISubCatalogoRepository;

@Service
public class SubCatalogoService {
    
    @Autowired
    ISubCatalogoRepository subCatalogoRepository;

    public List<SubCatalogoModel> getSubCatalogosByIdCatalogo(Long idCatalogo){
        return subCatalogoRepository.getSubcatalogoByIdCatalogo(idCatalogo); 
    }
}
