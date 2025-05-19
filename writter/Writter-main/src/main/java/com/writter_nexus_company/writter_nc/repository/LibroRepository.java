package com.writter_nexus_company.writter_nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.writter_nexus_company.writter_nc.model.Libro;
import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByIdAutor(Long idAutor);
    List<Libro> findByIdCategoria(Long idCategoria);
    List<Libro> findByIdTitulo(Long idTitulo);
    List<Libro> findByIdComentario(Long idComentario);

}
