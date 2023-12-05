/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class TituloPanelInformacion extends JPanel {
    private JLabel titulo;

    /**
     * COnstructor de la clase.
     */
    public TituloPanelInformacion() {
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        titulo = new JLabel("Informacion Panel:");
        titulo.setFont(new Font("Sans", Font.BOLD, 15));
        
        
        this.add(titulo);
    }    
}
