package com.writter_nexus_company.writter_nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.writter_nexus_company.writter_nc.model.rol;

public interface rolRepository extends JpaRepository<rol, Long>{

    rol findById (Integer id);
}
