package com.musicapi.controller;

import com.musicapi.model.Artista;
import com.musicapi.service.ArtistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artistas") //definición el endpoint principal
class ArtistaController {
    private final ArtistaService artistaService;

    /*
    Primer endpoint que muestra todos los artistas
     */
    @GetMapping public ResponseEntity<List<Artista>> getArtistas(){
        List<Artista> artistas = artistaService.getArtistas();
        return new ResponseEntity<>(artistas, HttpStatus.OK);
    }



}
