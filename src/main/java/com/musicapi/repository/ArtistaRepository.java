package com.musicapi.repository;

import com.musicapi.model.Artista;

import java.util.ArrayList;
import java.util.List;

public class ArtistaRepository {
    /*
    Inicialización de lista de artistas
     */
    private long id = 1;
    private final List<Artista> artistas = new ArrayList<>();

    public ArtistaRepository (){}

    public Artista guardarArtista(Artista artista){
        artistas.add(artista);
        artista.setArtistaId(id);
        id++;
        return artista;
    }




}
