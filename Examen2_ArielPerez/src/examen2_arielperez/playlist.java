/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielperez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class playlist implements Serializable{
      private String nombre;
    private ArrayList<canciones> canciones = new ArrayList();
    private static final long SerialVersonUID = 777L;

    public playlist() {
    }

    public playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "playlist{" + "nombre=" + nombre + ", canciones=" + canciones + '}';
    }
    
    
}
