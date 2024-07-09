package com.api.crecoscorp.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.api.crecoscorp.context.UsuarioContext;
import com.api.crecoscorp.models.PersonaModel;
import com.api.crecoscorp.models.ResponseData;
import com.api.crecoscorp.services.PersonaService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/persona")
public class SolicitanteController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/solicitante/cedula/{identificacion}")
    public ResponseEntity<ResponseData<Optional<PersonaModel>>> getSolicitanteByIdentificacion(@PathVariable String identificacion) {
        try {
            Optional<PersonaModel> solicitante = personaService.getSolicitanteByIdentificacion(identificacion);
            String mensajeError = "Proceso correcto";
            ResponseData<Optional<PersonaModel>> responseData = new ResponseData<>(solicitante, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            Optional<PersonaModel> usuario = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<Optional<PersonaModel>> responseError = new ResponseData<>(usuario, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

    @GetMapping("/solicitante/celular/{celular}")
    public ResponseEntity<ResponseData<Optional<PersonaModel>>> getSolicitanteByCelular(@PathVariable String celular) {
        try {
            Optional<PersonaModel> solicitante = personaService.getSolicitanteByCelular(celular);
            String mensajeError = "Proceso correcto";
            ResponseData<Optional<PersonaModel>> responseData = new ResponseData<>(solicitante, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            Optional<PersonaModel> usuario = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<Optional<PersonaModel>> responseError = new ResponseData<>(usuario, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }
    
    @GetMapping("/solicitante/email/{email}")
    public ResponseEntity<ResponseData<Optional<PersonaModel>>> getSolicitanteByEmail(@PathVariable String email) {
        try {
            Optional<PersonaModel> solicitante = personaService.getSolicitanteByEmail(email);
            String mensajeError = "Proceso correcto";
            ResponseData<Optional<PersonaModel>> responseData = new ResponseData<>(solicitante, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            Optional<PersonaModel> usuario = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<Optional<PersonaModel>> responseError = new ResponseData<>(usuario, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }
}
