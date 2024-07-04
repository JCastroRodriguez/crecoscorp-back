package com.api.crecoscorp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.crecoscorp.context.UsuarioContext;
import com.api.crecoscorp.models.ResponseData;
import com.api.crecoscorp.models.UsuarioModel;
import com.api.crecoscorp.services.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public ResponseEntity<ResponseData<UsuarioModel>> getUsuarioLogin(
            @RequestParam String nombreUsuario,
            @RequestParam String clave) {
        UsuarioModel usuario = new UsuarioModel();
        try {
            usuario = usuarioService.usuarioLogin(nombreUsuario, clave);
            String mensajeError = "Usuario Correcto";
            ResponseData<UsuarioModel> responseData = new ResponseData<>(usuario, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            usuario = null;
            String mensajeError = "Ocurrio un error";
            ResponseData<UsuarioModel> responseError = new ResponseData<>(usuario, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

    @PostMapping("/guardar")
    public UsuarioModel postGuardarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> getUsuarioById(@PathVariable Long id) {
        return usuarioService.getById(id);
    }

    @GetMapping("/all")
    public ResponseEntity<ResponseData<List<UsuarioContext>>> getPerfilAll() {
        List<UsuarioContext> usuarios = new ArrayList<UsuarioContext>();
        try {
            usuarios = usuarioService.getUsuarioAll();
            String mensajeError = "Usuarios Correctos";
            ResponseData<List<UsuarioContext>> responseData = new ResponseData<>(usuarios, mensajeError, 200);
            return ResponseEntity.ok().body(responseData);
        } catch (Exception e) {
            usuarios = null;
            String mensajeError = "Ocurrió un error";
            ResponseData<List<UsuarioContext>> responseError = new ResponseData<>(usuarios, mensajeError, 400);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
        }
    }

}
