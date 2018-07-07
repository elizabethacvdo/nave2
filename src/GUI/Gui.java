/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Threats.NaveThreats;
import guardianes_de_la_galaxia.Fondo;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Gui extends JFrame implements KeyListener{

    private JLabel labelNave;
    private JButton inicio;
    private String[] nombres = {"nave"};

    public Gui() {
        super("Juego De Naves");
        initialcomponents();

        Fondo p = new Fondo("space.gif");
        this.add(p, BorderLayout.CENTER);
        p.repaint();
        
    }

    public void initialcomponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelNave =new JLabel();
       
        Container container = getContentPane();

        JLabel fondo = new JLabel();
        fondo.setSize(700, 700);
        ImageIcon imgFondo = new ImageIcon(getClass().getResource("/GUI/space.gif"));

        Icon icono = new ImageIcon(imgFondo.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        fondo.setIcon(icono);

        fondo.setBounds(0, 0, 700, 700);

       
            labelNave = new JLabel();
            labelNave.setIcon(new ImageIcon(getClass().getResource("nave"+ ".gif")));
            labelNave.setBounds(10, 10, 200, 200);
            container.add(labelNave);
       

        container.add(fondo);

       
                //NaveThreats nave = new NaveThreats("nave", 600, labelNave.getX(), labelNave.getY(), labelNave);
                //nave.start();
                
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

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP){
            labelNave.setLocation(labelNave.getX(),labelNave.getY()+100);
            
        } 
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            labelNave.setLocation(labelNave.getX(),labelNave.getY()-100);
            
        } 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
