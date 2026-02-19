package com.musicapi.controller;

import com.musicapi.model.Artista;
import com.musicapi.repository.ArtistaRepository;
import com.musicapi.service.ArtistaService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas") //definición el endpoint principal
public class ArtistaController {
    private final ArtistaService artistaService;
    public ArtistaController(ArtistaService artistaService){
        this.artistaService = artistaService;
    }
    /*
    Primer endpoint que muestra todos los artistas
     */
    @GetMapping public ResponseEntity<List<Artista>> getArtistas(){ //Ver todos los artistas
        List<Artista> artistas = artistaService.getArtistas();
        return new ResponseEntity<>(artistas, HttpStatus.OK);
    }

    @PutMapping ({"artistaId"})public String actualizarArtista(Artista artista){
        return "Artista actualizado";
    }

    @DeleteMapping({"artistaId"}) public String borrarArtista(@PathVariable Long artistaId){
        return "Artista eliminado";
    }

    @PostMapping public ResponseEntity<String> guardarArtista(@RequestBody Artista artista){
        return new ResponseEntity<>("Artista guardado: " + artista.getNombre(),HttpStatus.CREATED);
    }



}
