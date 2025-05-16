package com.writter_nexus_company.writter_nc.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writter_nexus_company.writter_nc.model.comentario;
import com.writter_nexus_company.writter_nc.repository.comentarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class comentarioService {

    @Autowired
    private comentarioRepository comentarioRepository;

    public List<comentario> findAll(){
        return comentarioRepository.findAll();
    }

    public comentario findById(Long id){
        return comentarioRepository.getById(id);
    }

    public usuario save(comentario comentario){
        return comentarioRepository.save(comentario);
    }

    public void delete(Long comentario){
        comentarioRepository.deleteById(idcomentario);
    }

    public usuario patchUsuario(Long id, comentario parcialusuario){
        Optional<comentario> comentarioOptional = comentarioRepository.findById(id);
        if (comentarioOptional.isPresent()) {
            
            usuario usuarioToUpdate = comentarioOptional.get();
            
            if (parcialcomentario.getNombreUsuario() != null) {
                comentarioToUpdate.setNombreUsuario(parcialcomentario.getNombreUsuario());
            }

            if(parcialcomentario.getIdUsuario() != null) {
                comentarioToUpdate.setIdUsuario(parcialcomentario.getIdUsuario());
            }

            if (parcialcomentario.getEmailUsuario() != null) {
                comentarioToUpdate.setEmailUsuario(parcialcomentario.getComentario());
            }

            if(parcialcomentario.getContrasena() != null) {
                comentarioToUpdate.setContrasena(parcialcomentario.getContrasena());
            }

            return libroRepository.save(comentarioToUpdate);
        } else {
            return null; // or throw an exception
        }
    }
}
