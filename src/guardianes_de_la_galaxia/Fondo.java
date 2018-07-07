/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardianes_de_la_galaxia;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Elizabeth
 */
public class Fondo extends javax.swing.JPanel {
    
    String imagen = "";

    public Fondo(String imagen) {
        this.imagen = imagen;
        this.setSize(700, 700);
    }

    @Override
    public void paint(Graphics g) {
        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon(getClass().getResource("/GUI/" + imagen)));
        fondo.setBounds(0, 0,700,700);
        add(fondo);
        setOpaque(false);
        super.paintComponent(g);
    }
}
