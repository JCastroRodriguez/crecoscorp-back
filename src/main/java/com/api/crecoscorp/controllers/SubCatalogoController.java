package com.api.crecoscorp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.crecoscorp.models.ResponseData;
import com.api.crecoscorp.models.SubCatalogoModel;
import com.api.crecoscorp.services.SubCatalogoService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/subcatalogo")
public class SubCatalogoController {

    @Autowired
    private SubCatalogoService subCatalogoService;
    
    @GetMapping("/catalogo/{idCatalogo}")
    public ResponseEntity<ResponseData<List<SubCatalogoModel>>> getSubcatalogosByIdCatalogo(
        @PathVariable Long idCatalogo
    ) {
        List<SubCatalogoModel> subcatalogos = new ArrayList<SubCatalogoModel>();
        try {
            subcatalogos = subCatalogoService.getSubCatalogosByIdCatalogo(idCatalogo);
            String mensajeError = "Usuarios Correctos";
            ResponseData<List<SubCatalogoModel>> responseData = new ResponseData<>(subcatalogos, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            subcatalogos = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<List<SubCatalogoModel>> responseError = new ResponseData<>(subcatalogos, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }
}
