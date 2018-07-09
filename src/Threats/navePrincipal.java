/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Elizabeth
 */
public class navePrincipal extends Thread implements KeyListener{
    
    private String nombre;
    private int limite, x, y;
    private JLabel labelNave;
    private int naveY;
    private javax.swing.JLabel lbn;
    private JFrame padre;

    public navePrincipal() {

    }

    public navePrincipal(String nombre, int limite, JLabel nave,JFrame padre) {
        this.nombre = nombre;
        this.limite = limite;
        this.labelNave = nave;
        this.padre=padre;
        padre.addKeyListener(this);
        padre.setResizable(false); 
    }      

    @Override
    public void run() {
        
    }

    
    @Override//no puedo ponerle limite de abajo y ala derecha 
    public void keyPressed(KeyEvent ke) {
        
        switch(ke.getExtendedKeyCode()){// captura las teclas
case KeyEvent.VK_UP: 
    if(labelNave.getY()>=2)
    labelNave.setLocation(labelNave.getX(),labelNave.getY()-13);//arriba}
    break;
case KeyEvent.VK_DOWN: 
    if(labelNave.getY()<=200)labelNave.setLocation(labelNave.getX(),labelNave.getY()+13);//abajo
    break;
case KeyEvent.VK_LEFT: 
    if(labelNave.getX()>=5)labelNave.setLocation(labelNave.getX()-13,labelNave.getY());// derecha
break;
case KeyEvent.VK_RIGHT: 
    if(labelNave.getX()<650)labelNave.setLocation(labelNave.getX()+13,labelNave.getY()); //izquierda
break; // hace que la imagen se mueva con las teclas.
}
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

     
    }


