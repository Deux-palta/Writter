package com.writter_nexus_company.writter_nc.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writter_nexus_company.writter_nc.model.libro;
import com.writter_nexus_company.writter_nc.repository.libroRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class libroService {

    @Autowired
    private libroRepository libroRepository;

    public List<libro> findAll(){
        return libroRepository.findAll();
    }

    public libro findById(Long id){
        return libroRepository.getById(id);
    }

    public libro save(libro libro){
        return libroRepository.save(rol);
    }

    public void delete(Long id){
        libroRepository.deleteById(id);
    }

    public libro patchRol(Long id, libro parciallibro){
        Optional<libro> libroOptional = libroRepository.findById(id);
        if (libroOptional.isPresent()) {
            
            libro libroToUpdate = libroOptional.get();
            
            if (parciallibro.getNombreAutor() != null) {
                libroToUpdate.setNombreAutor(parciallibro.getNombreAutor());
            }

            if(parciallibro.getIdLibro() != null) {
                libroToUpdate.setIdLibro(parciallibro.getIdLibro());
            }

            if (parciallibro.getNombreLibro() != null) {
                libroToUpdate.setNombreLibro(parciallibro.getNombreLibro());
            }

            if(parciallibro.getGenero() != null) {
                libroToUpdate.setGenero(parciallibro.getGenero());
            }

            if (parciallibro.getFechaPub() != null) {
                libroToUpdate.setFechaPub(parciallibro.getFechaPub());
            }

            if(parciallibro.getFechaAct() != null) {
                libroToUpdate.setFechaAct(parciallibro.getFechaAct());
            }

            if (parciallibro.getCategoria() != null) {
                libroToUpdate.setCategoria(parciallibro.getCategoria());
            }

            return libroRepository.save(libroToUpdate);
        } else {
            return null; // or throw an exception
        }
    }
}
