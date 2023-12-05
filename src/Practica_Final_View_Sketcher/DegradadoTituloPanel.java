/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class DegradadoTituloPanel extends JPanel {
    private JLabel titulo;

    /**
     * Constructor de la clase.
     */
    public DegradadoTituloPanel() {
        
        this.setLayout(new BorderLayout());
        
        titulo = new JLabel(" Degradado: ");
        titulo.setFont(new Font("Sans", Font.BOLD, 30));
        
        this.add(titulo, BorderLayout.CENTER);
    }
    
}
