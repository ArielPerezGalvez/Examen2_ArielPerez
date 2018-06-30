/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielperez;

import java.io.Serializable;

/**
 *
 * @author ariel
 */
public class canciones implements Serializable{
      private String nombre;
    private String artista;
    private int s;
    private String genero;
    private static final long SerialVersonUID = 777L;

    public canciones() {
    }

    public canciones(String nombre, String artista, int s, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.s = s;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", artista=" + artista + ", s=" + s + ", genero=" + genero + '}';
    }
    
    
    
}
