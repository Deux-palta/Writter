package com.writter_nexus_company.writter_nc.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writter_nexus_company.writter_nc.model.biblioteca;
import com.writter_nexus_company.writter_nc.repository.bibliotecaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class bibliotecaService {

    @Autowired
    private bibliotecaRepository bibliotecaRepository;

    public List<biblioteca> findAll(){
        return bibliotecaRepository.findAll();
    }

    public biblioteca findById(Long id){
        return bibliotecaRepository.getById(id);
    }

    public biblioteca save(biblioteca biblioteca){
        return bibliotecaRepository.save(biblioteca);
    }

    public void delete(Long biblioteca){
        bibliotecaRepository.deleteById(idbiblioteca);
    }

    public biblioteca patchBiblioteca(Long id, biblioteca parcialbiblioteca){
        Optional<biblioteca> bibliotecaOptional = bibliotecaRepository.findById(id);
        if (bibliotecaOptional.isPresent()) {
            
            biblioteca bibliotecaToUpdate = bibliotecaOptional.get();
            
            if (parcialbiblioteca.getNombreBiblioteca() != null) {
                bibliotecaToUpdate.setNombreBiblioteca(parcialbiblioteca.getNombreBiblioteca());
            }

            if(parcialbiblioteca.getDireccionBiblioteca() != null) {
                bibliotecaToUpdate.setDireccionBiblioteca(parcialbiblioteca.getDireccionBiblioteca());
            }

            return bibliotecaRepository.save(bibliotecaToUpdate);
        } else {
            return null; // or throw an exception
        }
    }
}
