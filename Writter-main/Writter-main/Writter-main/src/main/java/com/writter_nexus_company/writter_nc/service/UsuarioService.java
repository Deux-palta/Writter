package com.writter_nexus_company.writter_nc.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writter_nexus_company.writter_nc.model.usuario;
import com.writter_nexus_company.writter_nc.repository.usuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class usuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public usuario findById(Long id){
        return usuarioRepository.getById(id);
    }

    public usuario save(usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void delete(Long usuario){
        usuarioRepository.deleteById(idUsuario);
    }

    public usuario patchUsuario(Long id, usuario parcialusuario){
        Optional<usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
            
            Usuario usuarioToUpdate = usuarioOptional.get();
            
            if (parcialusuario.getNombreUsuario() != null) {
                usuarioToUpdate.setNombreUsuario(parcialusuario.getNombreUsuario());
            }

            if(parcialusuario.getIdUsuario() != null) {
                usuarioToUpdate.setIdUsuario(parcialusuario.getIdUsuario());
            }

            if (parcialusuario.getEmailUsuario() != null) {
                usuarioToUpdate.setEmailUsuario(parcialusuario.getEmailUsuario());
            }

            if(parcialusuario.getContrasena() != null) {
                usuarioToUpdate.setContrasena(parcialusuario.getContrasena());
            }

            return usuarioRepository.save(usuarioUpdate);
        } else {
            return null; // or throw an exception
        }
    }
}
