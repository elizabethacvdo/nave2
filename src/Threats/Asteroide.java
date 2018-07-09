/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;



import static Threats.navePrincipal.detectarColicion;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

/**
 *
 * @author Mery Acevedo
 */
public class Asteroide extends Thread{
    private JLabel asteroide=null;
    private int con=0,x,y,ax,ay;
    private static boolean a;
      
    
    public Asteroide(JLabel asteroide ,int contador){
        this.asteroide=asteroide;
        this.con=contador;
        a=false;
    }
 
    

    @Override
    public void run() {
       
        if(con==9){
        for(int i=790;i>=10;i-=8){
            this.asteroide.setLocation(i,250);
            a=detectarColicion(asteroide);
            if(i==10){
              this.asteroide.removeAll();  
            }
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Asteroide.class.getName()).log(Level.SEVERE, null, ex);
            }yield();
    }
        }if(con==7){
            for(int i=700;i>=10;i-=10){
            this.asteroide.setLocation(i,140);
           a=detectarColicion(asteroide);
           
            
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Asteroide.class.getName()).log(Level.SEVERE, null, ex);
            }yield();
    }this.asteroide.removeAll();
        }
        if(con==5){
            for(int i=700;i>=10;i-=18){
            this.asteroide.setLocation(i,10);
            a=detectarColicion(asteroide);
                
            
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Asteroide.class.getName()).log(Level.SEVERE, null, ex);
            }yield();
    }this.asteroide.removeAll();
        }
        
    }

    public static boolean isA() {
        return a;
    }

    
    
   
    
    
    
    
    
}
