package com.musicapi.model;


public class Artista {
    private String nombre;
    private Boolean solista; // true: solista, false: grupo
    private String generoPrincipal;

    public Artista(String nombre, Boolean solista, String generoPrincipal) {
        this.nombre = nombre;
        this.solista = solista;
        this.generoPrincipal = generoPrincipal;
    }

    private int artistaId; // no se manda en el request, se genera al guardar

    public int getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(int artistaId) {
        this.artistaId = artistaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getSolitsta() {
        return solista;
    }

    public void setSolitsta(Boolean solitsta) {
        this.solista = solitsta;
    }

    public String getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }
}
