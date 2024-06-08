package com.jifs.jifis_plataforma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jifs.jifis_plataforma.model.Coordenadores;

@Repository
public interface CoordenadoresRepository extends JpaRepository<Coordenadores, Long> {
    
}
