package com.musicapi.service;

import com.musicapi.model.Artista;
import com.musicapi.repository.ArtistaRepository;

import java.util.List;

public class ArtistaService {
    //Llamar a capa repositorio donde se alamcenan los datos
    private final ArtistaRepository artistaRepository;


    public ArtistaService(ArtistaRepository artistaRepository){
        this.artistaRepository = artistaRepository;
    }


    /*
    Obtiene todos los artistas
     */
    public List<Artista> getArtistas(){
        return artistaRepository.getArtistas();
    }

}
