package com.api.crecoscorp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crecoscorp.context.UsuarioContext;
import com.api.crecoscorp.models.UsuarioModel;
import com.api.crecoscorp.repositories.IUsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    IUsuarioRepository usuarioRepository;

    public UsuarioModel usuarioLogin(String nombreUsuario, String claveUsuario){
        return usuarioRepository.getValidaUsuarioLogeado(nombreUsuario, claveUsuario);
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public Optional<UsuarioContext> getById(Long id){
        return usuarioRepository.getUsuarioById(id); 
    }

    public List<UsuarioContext> getUsuarioAll(){
        return usuarioRepository.getUsuarioAll(); 
    }

    /*public Optional<UsuarioModel> getByIdN(Long id){
        return usuarioRepository.findById(id); 
    }*/
}
