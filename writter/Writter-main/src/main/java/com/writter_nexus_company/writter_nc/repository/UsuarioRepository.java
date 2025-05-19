package com.writter_nexus_company.writter_nc.repository;

import java.util.List;
import java.util.Optional;

import com.writter_nexus_company.writter_nc.model.Usuario;

public interface UsuarioRepository {
    List<Usuario> findAll();
    Usuario getById(Long id);
    Usuario save(Usuario usuario);
    void deleteById(Long idUsuario);
    Optional<Usuario> findById(Long id);

}
