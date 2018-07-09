/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;

import guardianes_de_la_galaxia.Volver;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.image.ImageObserver.ABORT;
import javax.swing.*;

/**
 *
 * @author Elizabeth
 */
public class navePrincipal implements KeyListener{
    
    private String nombre;
    private int limite, x=0, y=0;
    private static JLabel labelNave;
    private int naveY=0;
    private javax.swing.JLabel lbn;
    private static JFrame padre;
private static int con;
    public navePrincipal() {

    }

    public JLabel getLabelNave() {
        return labelNave;
    }
    

    public navePrincipal(String nombre, int limite, JLabel nave,JFrame padre,int con) {
        this.nombre = nombre;
        this.limite = limite;
        this.labelNave = nave;
        this.padre=padre;
        padre.addKeyListener(this);
        padre.setResizable(false); 
        this.con=con;
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

    public static boolean detectarColicion(JLabel enemigo){
        int x=labelNave.getX();
        int y=labelNave.getY();
        int ax=labelNave.getWidth()+x;
        int ay=labelNave.getHeight()+y;
        
        if(enemigo.getX()>=x &&enemigo.getX()<=ax && enemigo.getY()>=y &&enemigo.getY()<=ay ){
            if (con==0){
            con+=1;
            
          new Volver().setVisible(true);
          
          padre.dispose();
          return true;
        }}
            return false;
        
    } 
    
    
    
    
    
    
   
    
    
    

    
    }


