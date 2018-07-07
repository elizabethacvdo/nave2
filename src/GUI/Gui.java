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

    private JLabel[] labels;
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

        labels = new JLabel[3];
        inicio = new JButton("inicio");
        Container container = getContentPane();

        JLabel fondo = new JLabel();
        fondo.setSize(700, 700);
        ImageIcon imgFondo = new ImageIcon(getClass().getResource("/GUI/space.gif"));

        Icon icono = new ImageIcon(imgFondo.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        fondo.setIcon(icono);

        fondo.setBounds(0, 0, 700, 700);

        for (int i = 0; i < 1; i++) {
            labels[i] = new JLabel();
            labels[i].setIcon(new ImageIcon(getClass().getResource(nombres[i] + ".gif")));
            labels[i].setBounds(10, (i * 200) + 100, 200, 200);
            container.add(labels[i]);
        }

        inicio.setBounds(10, 0, 100, 30);
        container.add(inicio);
        container.add(fondo);

        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NaveThreats nave = new NaveThreats("nave", 510, labels[0].getX(), labels[0].getY(), labels[0]);
                nave.start();
            }
        });
        setSize(700, 700);
    }
    /***********************************************************************************************************/
        private void PanelkeyPressed(java.awt.event.KeyEvent ewt) {
           (labels[1].getLocation()>){
           
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
