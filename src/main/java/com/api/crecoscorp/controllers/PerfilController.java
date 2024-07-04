package com.api.crecoscorp.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.api.crecoscorp.context.PerfilContext;
import com.api.crecoscorp.models.PerfilModel;
import com.api.crecoscorp.models.ResponseData;
import com.api.crecoscorp.services.PerfilService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/perfil")
public class PerfilController {

    @Value("${spring.vars.status.creado}")
    private Integer creado;

    @Value("${spring.vars.status.modificado}")
    private Integer actualizado;

    @Value("${spring.vars.estado.activo}")
    private Integer activo;

    @Autowired
    private PerfilService perfilService;

    @GetMapping("/all")
    public ResponseEntity<ResponseData<List<PerfilContext>>> getPerfilAll() {
        List<PerfilContext> perfil = new ArrayList<PerfilContext>();
        try {
            perfil = perfilService.getPerfilAll();
            String mensajeError = "Perfil Correcto";
            ResponseData<List<PerfilContext>> responseData = new ResponseData<>(perfil, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            perfil = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<List<PerfilContext>> responseError = new ResponseData<>(perfil, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

    @PostMapping(value = "/crear-perfil")
    public ResponseEntity<?> crearPerfil(
            @RequestBody PerfilModel jsonPerfil) throws Exception {
        PerfilModel perfil = new PerfilModel();
        try {
            if (jsonPerfil.getId() == null) {

                jsonPerfil.setEstado(activo);
                jsonPerfil.setStatus(creado);
                perfilService.postCrearPerfil(jsonPerfil);
                String mensajeError = "Perfil creado correctamente";
                ResponseData<PerfilModel> responseData = new ResponseData<>(perfil, mensajeError, 200);
                return ResponseEntity.ok().body(responseData);
            } else {
                perfil = null;
                String mensajeError = "Perfil ya existe";
                ResponseData<PerfilModel> responseError = new ResponseData<>(perfil, mensajeError, 400);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
            }
        } catch (Exception e) {
            perfil = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<PerfilModel> responseError = new ResponseData<>(perfil, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

    @PutMapping(value = "/actualizar-perfil")
    public ResponseEntity<?> actualizarPerfil(
            @RequestParam Long idPerfil,
            @RequestBody PerfilModel jsonPerfil) throws Exception {
        PerfilModel perfil = new PerfilModel();
        try {
            Optional<PerfilModel> pf = perfilService.getPerfilById(idPerfil);
            if (pf.isPresent()) {
                perfil.setNombrePerfil(jsonPerfil.getNombrePerfil());
                perfil.setDescripcionPerfil(jsonPerfil.getDescripcionPerfil());
                perfil.setEstado(jsonPerfil.getEstado());
                perfil.setCodigoUsuario(jsonPerfil.getCodigoUsuario());
                perfil.setFecha(jsonPerfil.getFecha());
                perfil.setStatus(actualizado);

                perfilService.putActualizarPerfil(jsonPerfil);
                String mensajeError = "Perfil actualizado correctamente";
                ResponseData<PerfilModel> responseData = new ResponseData<>(perfil, mensajeError, 200);
                return ResponseEntity.ok().body(responseData);
            } else {
                perfil = null;
                String mensajeError = "Perfil no existe";
                ResponseData<PerfilModel> responseError = new ResponseData<>(perfil, mensajeError, 400);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
            }
        } catch (Exception e) {
            perfil = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<PerfilModel> responseError = new ResponseData<>(perfil, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

}
