package com.writter_nexus_company.writter_nc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writter_nexus_company.writter_nc.model.rol;
import com.writter_nexus_company.writter_nc.repository.rolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class rolService {

    @Autowired
    private rolRepository rolRepository;

    public List<rol> findAll(){
        return rolRepository.findAll();
    }

    public rol findById(Long id){
        return rolRepository.getById(id);
    }

    public rol save(rol rol){
        return rolRepository.save(rol);
    }

    public void delete(Long id){
        rolRepository.deleteById(id);
    }

    public rol patchRol(Long id, rol parcialrol){
        Optional<rol> rolOptional = rolRepository.findById(id);
        if (rolOptional.isPresent()) {
            
            rol rolToUpdate = rolOptional.get();
            
            if (parcialrol.getNombreRol() != null) {
                rolToUpdate.setNombreRol(parcialrol.getNombreRol());
            }
            return rolRepository.save(rolToUpdate);
        } else {
            return null; // or throw an exception
        }
    }
}
