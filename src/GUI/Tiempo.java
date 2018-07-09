/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Threats.Asteroide;
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
    private JLabel time,asteroide,asteroide2,asteroide3;
    private int contador=1;

public Tiempo(){   
}


public Tiempo(JLabel lbltime, JFrame padre,JLabel asteroide,JLabel asteroide2,JLabel asteroide3){
    this.padre=padre;
    this.time=lbltime;
    this.asteroide=asteroide;
    this.asteroide2=asteroide2;
    this.asteroide3=asteroide3;
}

    @Override
    public void run() {
       
        while(contador<=121){
            
            if(contador%9==0){
                 Asteroide as= new Asteroide(this.asteroide,9);
                  as.start();
            }
            if(contador%7==0){
                 Asteroide as= new Asteroide(this.asteroide2,7);
                  as.start();
            }
            if(contador%5==0){
                 Asteroide as= new Asteroide(this.asteroide3,5);
                  as.start();
            }
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
