package com.api.crecoscorp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crecoscorp.models.GaranteModel;
import com.api.crecoscorp.models.ResponseData;
import com.api.crecoscorp.services.GaranteService;

@RestController
@RequestMapping("/api/garante")
public class GaranteController {
    
    @Autowired
    private GaranteService garanteService;

    @GetMapping("/cedula/{identificacion}")
    public ResponseEntity<ResponseData<Optional<GaranteModel>>> getSolicitanteByIdentificacion(@PathVariable String identificacion) {
        try {
            Optional<GaranteModel> garante = garanteService.getGaranteByIdentificacion(identificacion);
            String mensajeError = "Proceso correcto";
            ResponseData<Optional<GaranteModel>> responseData = new ResponseData<>(garante, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            Optional<GaranteModel> garante = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<Optional<GaranteModel>> responseError = new ResponseData<>(garante, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

    @GetMapping("/celular/{celular}")
    public ResponseEntity<ResponseData<Optional<GaranteModel>>> getSolicitanteByCelular(@PathVariable String celular) {
        try {
            Optional<GaranteModel> garante = garanteService.getGaranteByCelular(celular);
            String mensajeError = "Proceso correcto";
            ResponseData<Optional<GaranteModel>> responseData = new ResponseData<>(garante, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            Optional<GaranteModel> garante = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<Optional<GaranteModel>> responseError = new ResponseData<>(garante, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }
}
