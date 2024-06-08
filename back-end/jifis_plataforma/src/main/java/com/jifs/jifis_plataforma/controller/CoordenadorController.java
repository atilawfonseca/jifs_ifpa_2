package com.jifs.jifis_plataforma.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jifs.jifis_plataforma.model.Coordenador;
import com.jifs.jifis_plataforma.services.CoordenadoresService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/coordenador")
public class CoordenadorController {
    
private final CoordenadoresService service;

public CoordenadorController(CoordenadoresService service) {
    this.service = service;
}

@PostMapping
public ResponseEntity<Coordenador> cadastrarNovoCoordenador(@RequestBody Coordenador coordenador){
    return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarNovoCoordenador(coordenador));
}






}
