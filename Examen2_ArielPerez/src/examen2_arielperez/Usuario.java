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
public class Usuario implements Serializable{
     private String nombre;
    private String edad;
    private String user;
    private String pas;
    private ArrayList<canciones> favoritos = new ArrayList();
    private ArrayList<playlist> playlists = new ArrayList();
    private static final long SerialVersonUID = 777L;

    public Usuario() {
    }

    public Usuario(String nombre, String edad, String user, String pas) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.pas = pas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public ArrayList<canciones> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<canciones> favoritos) {
        this.favoritos = favoritos;
    }

    public ArrayList<playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", user=" + user + ", pas=" + pas + ", favoritos=" + favoritos + ", playlists=" + playlists + '}';
    }
    
    
}
