/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_arielperez;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author ariel
 */
public class hilo extends Thread {

    private JLabel hora;
    private int secs;
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public hilo(JLabel hora) {
        this.hora = hora;
    }

    public hilo(JLabel hora, int secs, JProgressBar barra) {
        this.hora = hora;
        this.secs = secs;
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    hilo(JProgressBar barra, String selectedValue, JProgressBar barra0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        int itime = 0;
        while (true && itime < secs) {
            itime += 1;
            String time = Integer.toString(itime);
            hora.setText(time);
            barra.setValue(barra.getValue() + 1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
