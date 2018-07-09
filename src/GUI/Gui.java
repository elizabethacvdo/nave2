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

    private JLabel labelNave,time,time2,asteroide,asteroide2,asteroide3;
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
        asteroide =new JLabel();
        asteroide2 =new JLabel();
        asteroide3 =new JLabel();
        time =new JLabel();
        time2 =new JLabel();
        time2 =new JLabel();
        time2.setText("tiempo");
        Container container = getContentPane();

        JLabel fondo = new JLabel();
        fondo.setSize(800, 400);
        ImageIcon imgFondo = new ImageIcon(getClass().getResource("/GUI/space.gif"));

        Icon icono = new ImageIcon(imgFondo.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT));
        fondo.setIcon(icono);

        fondo.setBounds(0, 0, 800, 400);

       
            
            labelNave.setIcon(new ImageIcon(getClass().getResource("nave.gif")));
            asteroide.setBounds(800,200, 50, 50);
            asteroide2.setBounds(800,100, 50, 50);
            labelNave.setBounds(10, 10, 200, 200);
            asteroide3.setBounds(800,175, 50, 50);
            ImageIcon img = new ImageIcon(getClass().getResource("/GUI/Asteroid2b.gif"));
            Icon icon = new ImageIcon(img.getImage().getScaledInstance(asteroide.getWidth(),asteroide.getHeight(), Image.SCALE_DEFAULT));
        asteroide.setIcon(icon);
        
        ImageIcon imga = new ImageIcon(getClass().getResource("/GUI/Asteroid2b.gif"));
            Icon icon2 = new ImageIcon(imga.getImage().getScaledInstance(asteroide2.getWidth(),asteroide2.getHeight(), Image.SCALE_DEFAULT));
        asteroide2.setIcon(icon2);
       
        ImageIcon imgam = new ImageIcon(getClass().getResource("/GUI/Asteroid2b.gif"));
            Icon icon3 = new ImageIcon(imgam.getImage().getScaledInstance(asteroide3.getWidth(),asteroide3.getHeight(), Image.SCALE_DEFAULT));
        asteroide3.setIcon(icon3);
            
            
            time.setBounds(50,2, 100,100);
            time.setForeground(Color.yellow);
            time2.setBounds(3,2, 100,100);
            time2.setForeground(Color.yellow);
             Tiempo tim=new Tiempo(time,getVentana(),asteroide,asteroide2,asteroide3);
             tim.start();
             navePrincipal na=new navePrincipal("algo",600,labelNave,getVentana());
            container.add(labelNave);
            container.add(asteroide);
             container.add(asteroide2);
             container.add(asteroide3);
            container.add(time);  
            container.add(time2);
            
      

        container.add(fondo);


            
                setSize(800,400);
           
    }
    /***********************************************************************************************************/
    /*
    public void choque(){
        int x=labelNave.getX();
        int ay=labelNave.getHeight();
        int y=labelNave.getY();
        int ax=labelNave.getWidth();
        if(this.asteroide.getX()>=x && this.asteroide.getX()<=x+ax &&this.asteroide.getY()>=y &&this.asteroide.getY()<=y+ay){
            this.dispose();
    }if(this.labelNave.getLocation()==this.asteroide2.getLocation()){
        this.dispose();
    }
    if(this.labelNave.getX()==this.asteroide3.getX()){
        this.dispose();
    }
    }
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
