/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Threats.navePrincipal;
import guardianes_de_la_galaxia.Fondo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Elizabeth
 */
public class Gui extends JFrame {

    private JLabel labelNave,time,time2;
    private JButton inicio;
    private String[] nombres = {"nave"};

    public Gui() {
        super("Juego De Naves");
        initialcomponents();
       
        Fondo p = new Fondo("space.gif");
        this.add(p, BorderLayout.CENTER);
        p.repaint();
        
    }
    
    public JFrame getVentana(){
        return this;
    } 

    public void initialcomponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelNave =new JLabel();
        time =new JLabel();
        time2 =new JLabel();
        time2.setText("tiempo");
        Container container = getContentPane();

        JLabel fondo = new JLabel();
        fondo.setSize(700, 700);
        ImageIcon imgFondo = new ImageIcon(getClass().getResource("/GUI/space.gif"));

        Icon icono = new ImageIcon(imgFondo.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        fondo.setIcon(icono);

        fondo.setBounds(0, 0, 700, 700);

       
            
            labelNave.setIcon(new ImageIcon(getClass().getResource("nave.gif")));
            labelNave.setBounds(10, 10, 200, 200);
            time.setBounds(50,2, 100,100);
            time.setForeground(Color.yellow);
            time2.setBounds(3,2, 100,100);
            time2.setForeground(Color.yellow);
             Tiempo tim=new Tiempo(time,getVentana());
             tim.start();
             navePrincipal na=new navePrincipal("algo",600,labelNave,getVentana());
            container.add(labelNave);
            container.add(time);  
            container.add(time2);
           
       

        container.add(fondo);


            
                setSize(700,700);
           
    }
    /***********************************************************************************************************/
    
    /**********************************************************************************************************/

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });

    }



    

  
}
