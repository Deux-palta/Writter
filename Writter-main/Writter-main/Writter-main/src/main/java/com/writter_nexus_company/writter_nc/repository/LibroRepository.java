package com.writter_nexus_company.writter_nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.writter_nexus_company.writter_nc.libro;
import java.util.List;

@Repository
public interface libroRepository JpaRepository<libro,Long> {

    List<libro> findByNombre(String nombre);

    Libro findById(Integer id);
}
