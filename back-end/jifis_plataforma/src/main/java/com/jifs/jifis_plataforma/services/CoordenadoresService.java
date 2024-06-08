package com.jifs.jifis_plataforma.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jifs.jifis_plataforma.model.Coordenador;
import com.jifs.jifis_plataforma.repositories.CoordenadoresRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CoordenadoresService {
    
    private final CoordenadoresRepository repository;

    public CoordenadoresService(CoordenadoresRepository repository) {
        this.repository = repository;
    }

    public Coordenador cadastrarNovoCoordenador(Coordenador Coordenador){
        return repository.save(Coordenador);
    }

    public Coordenador buscarCoordenadorPorSiape(String siape){
        return repository.findById(siape).orElseThrow(()
                -> new EntityNotFoundException("SIAPE não encontrado"));
    }

    public List<Coordenador> listarTodosCoordenadores(){
        return repository.findAll();
    }

}
