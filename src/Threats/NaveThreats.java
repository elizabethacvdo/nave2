/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.yield;
import javax.swing.*;

/**
 *
 * @author Elizabeth
 */
public class NaveThreats extends Thread implements KeyListener{
    
    private String nombre;
    private int limite, x, y;
    private JLabel nave;
    private int naveY;
    private javax.swing.JLabel lbn;

    public NaveThreats() {

    }

    public NaveThreats(String nombre, int limite, int x, int y, JLabel nave) {
        this.nombre = nombre;
        this.limite = limite;
        this.x = x;
        this.y = y;
        this.nave = nave;
        nave.addKeyListener(this);
    }
    public void keyTyped(KeyEvent e) {
}
       
    
   
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP){
            nave.setLocation(nave.getX(),nave.getY()+100);
            
        } 
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            nave.setLocation(nave.getX(),nave.getY()-100);
            
        } /*
        if(e.getKeyCode()==KeyEvent.VK_SPACE&&nave.detenerDisparo){
            nave.disparo=true;
            nave.detenerDisparo=false;
        }
        if((e.getKeyChar()=='r'||e.getKeyChar()=='R')&&(nave.matarAliado||nave.matarEnemigo)){
            nave.reiniciar();
        }*/
        
}

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    }

