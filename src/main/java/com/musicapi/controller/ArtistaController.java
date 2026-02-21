package com.musicapi.controller;

import com.musicapi.model.Artista;
import com.musicapi.repository.ArtistaRepository;
import com.musicapi.service.ArtistaService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
Capa servicio: Maneja lógica de negocio
 */
@RestController
@RequestMapping("/artistas") //definición el endpoint principal
public class ArtistaController {
    private final ArtistaService artistaService;
    private final ArtistaRepository artistaRepository;

    public ArtistaController(ArtistaService artistaService, ArtistaRepository artistaRepository){
        this.artistaService = artistaService;
        this.artistaRepository = artistaRepository;
    }
    /*
    Primer endpoint que muestra todos los artistas
     */
    @GetMapping public ResponseEntity<List<Artista>> getArtistas(){ //Ver todos los artistas
        return new ResponseEntity<>(artistaService.getArtistas(), HttpStatus.OK);
    }

    //Endpoint para mostrar un artista específico por su artistaId
    @GetMapping("/{artistaId}") public ResponseEntity<Artista> buscarArtista(@PathVariable int artistaId){
        return new ResponseEntity<>(artistaService.get(artistaId),HttpStatus.OK );
    }


    //Endpoint que actualiza un artista
    @PutMapping ({"/{artistaId}"})public String actualizarArtista(Artista artista){
        return "Artista actualizado";
    }


    //Endpoint que borra un artista
    @DeleteMapping({"artistas/{artistaId}"}) public String borrarArtista(@PathVariable Long artistaId){
        return "Artista eliminado";
    }

    //Endpoint que guarda un nuevo artista
    @PostMapping public ResponseEntity<String> guardarArtista(@RequestBody Artista artista){
        artistaRepository.guardarArtista(artista);
        return new ResponseEntity<>("Artista guardado: " + artista.getNombre(),HttpStatus.CREATED);
    }



}
