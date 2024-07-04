package com.api.crecoscorp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crecoscorp.repositories.ISubCatalogoRepository;

@Service
public class SubCatalogoService {
    
    @Autowired
    ISubCatalogoRepository subCatalogoRepository;
}
