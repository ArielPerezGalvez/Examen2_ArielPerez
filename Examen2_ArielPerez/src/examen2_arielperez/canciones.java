/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielperez;

/**
 *
 * @author ariel
 */
public class canciones {
    private String nombre;
    private String artista;
    private double segundos;
    private String genero;

    public canciones() {
    }

    public canciones(String nombre, String artista, double segundos, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.segundos = segundos;
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

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", artista=" + artista + ", segundos=" + segundos + ", genero=" + genero + '}';
    }
    
    
    
    
    
    
}//fin de la clase
