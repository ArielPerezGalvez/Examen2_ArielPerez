/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielperez;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class album {
    private String nombre;
    private String artista;
    private ArrayList <canciones> cancion= new ArrayList();

    public album() {
    }

    public album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
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

    public ArrayList<canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<canciones> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "album{" + "nombre=" + nombre + ", artista=" + artista + ", cancion=" + cancion + '}';
    }
    
    
    
    
    
    
    
}//fin de la clase
