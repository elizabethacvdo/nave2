/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

/**
 *
 * @author Mery Acevedo
 */
public class Asteroide extends Thread{
    private JLabel asteroide;
    private int con;
      
    
    public Asteroide(JLabel asteroide ,int contador){
        this.asteroide=asteroide;
        this.con=contador;
    }
 
    

    @Override
    public void run() {
        if(con==9){
        for(int i=800;i>=10;i-=9){
            this.asteroide.setLocation(i,250);
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
            this.asteroide.setLocation(i,100);
            
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Asteroide.class.getName()).log(Level.SEVERE, null, ex);
            }yield();
    }this.asteroide.removeAll();
        }
        if(con==5){
            for(int i=700;i>=10;i-=15){
            this.asteroide.setLocation(i,175);
            
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Asteroide.class.getName()).log(Level.SEVERE, null, ex);
            }yield();
    }this.asteroide.removeAll();
        }
        
    }
    
    public int algo(){
        return this.con;
    }
    
    
    public void algo2(int i){
        this.con=i;
    }
    
    
    
    
    
}
