package com.jifs.jifis_plataforma.services;

import org.springframework.stereotype.Service;

import com.jifs.jifis_plataforma.model.Coordenador;
import com.jifs.jifis_plataforma.repositories.CoordenadoresRepository;

import java.util.List;

@Service
public class CoordenadoresService {
    
    private final CoordenadoresRepository repository;

    public CoordenadoresService(CoordenadoresRepository repository) {
        this.repository = repository;
    }

    public Coordenador cadastrarNovoCoordenador(Coordenador Coordenador){
        return repository.save(Coordenador);
    }

    public List<Coordenador> listarTodosCoordenadores(){
        return repository.findAll();
    }

}
