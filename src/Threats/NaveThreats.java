/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.*;

/**
 *
 * @author Elizabeth
 */
public class NaveThreats extends Thread {

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
    }
    
       private void PanelkeyPressed(java.awt.event.KeyEvent ewt) {
            x = nave.getX();
            y = nave.getX();
        switch(ewt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:
                if(nave.getY()>=2)
                    nave.setLocation(x, y-2);
                    break;
                }
        }
    }

