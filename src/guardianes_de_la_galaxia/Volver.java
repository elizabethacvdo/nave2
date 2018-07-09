/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardianes_de_la_galaxia;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mery Acevedo
 */
public class Volver extends JFrame{
       private JLabel time;
    private JButton bstop;
    
    public Volver(){
        super("perdiste");
        inicio();
       
    }
    
    public JFrame getVentana(){
        return this;
    }
    
    public void inicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        time=new JLabel();
        time=new JLabel("game over");
       bstop=new JButton("stop");
       
        time.setBounds(150,75,50,50);
        bstop.setBounds(150,125,50,50);
        Container container=getContentPane();
         bstop.addActionListener((ActionEvent ae) -> {
             getVentana().dispose();
             new Ventana().setVisible(true);
             getVentana().dispose();
        });
        
        container.add(time);
       //container.add(bstop);
         setSize(300,300);  
    }
}
