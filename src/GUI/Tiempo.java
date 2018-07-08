/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mery Acevedo
 */
public class Tiempo extends Thread {

   
    private JFrame padre;
    private JLabel time;
    private int contador=0;

public Tiempo(){   
}


public Tiempo(JLabel lbltime, JFrame padre){
    this.padre=padre;
    this.time=lbltime;
}

    @Override
    public void run() {
        while(contador<=120){
            //funcion deacuerdo al tiempo
            try {
                time.setText(String.valueOf(contador++));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }//aqui se acaba el tiempo 
        
     
        
        yield();
        
    
    }
    
}
