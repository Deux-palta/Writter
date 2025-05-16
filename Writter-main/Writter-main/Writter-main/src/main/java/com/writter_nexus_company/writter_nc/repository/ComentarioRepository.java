package com.writter_nexus_company.writter_nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface comentarioRepository extends JpaRepository<comentario, Long> {

    @Query

}
