package com.musicapi.repository;

import com.musicapi.model.Artista;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
    private int id = 1;
    private final List<Artista> artistas = new ArrayList<>();

    public ArtistaRepository (){}

    public Artista guardarArtista(@RequestBody Artista artista){
        artistas.add(artista);
        artista.setArtistaId(id);
        id++;
        return artista;
    }
/*


    public Artista buscarArtista(@PathVariable int artistaId){

        return ;
    }

 */

    public List<Artista>verArtistas(){
        return artistas;
    }

    public void borrarArtista(int artistaId){

    }

    public void actualizarArtista(){

    }








}
