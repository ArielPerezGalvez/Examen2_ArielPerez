/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielperez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Admin implements Serializable{
     private ArrayList<Usuario> listauser = new ArrayList();
    private File archivo = null;
    private static final long SerialVersonUID = 777L;

    public Admin(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListauser() {
        return listauser;
    }

    public void setListauser(ArrayList<Usuario> listauser) {
        this.listauser = listauser;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUser(Usuario p) {
        this.listauser.add(p);
    }

    public void cargarArchivo() {
        try {
            listauser = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listauser.add(temp);
                    }
                } catch (Exception e) {
                    //encontro el final del archivo siempre se lanza la excepcion al terminar
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : listauser) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    
}
