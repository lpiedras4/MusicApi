package com.musicapi.repository;

import com.musicapi.model.Artista;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaRepository {
    /*
    Inicialización de lista de artistas
     */
    /*
    Aquí van las operaciones CRUD
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
    public List<Artista>getArtistas(){
        return artistas;
    }







}
