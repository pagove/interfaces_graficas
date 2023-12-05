/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class GraphicsPanel extends JPanel {
    private Practica_Final_Model model;
    private Lienzo lienzo;
    
    /**
     * Constructor de la clase.
     * @param model model
     */
    public GraphicsPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        this.setVisible(true);
        
        lienzo = new Lienzo();
        
        this.add(lienzo, BorderLayout.CENTER);
    
    }
    
    /**
     * Clase empotrada que nos permite pintar.
     */
    class Lienzo extends JPanel{

        @Override
        protected void paintComponent(Graphics grphcs) {
            Graphics2D gd = (Graphics2D) grphcs;
            gd.drawImage(model.getImagen(), 0, 0, this);
        }
        
    }

    /**
     * Metodo get. Metodo para acceder a la clase empotrada lienzo.
     * @return lienzo
     */
    public Lienzo getLienzo() {
        return lienzo;
    }  
}
