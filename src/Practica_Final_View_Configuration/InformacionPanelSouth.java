/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class InformacionPanelSouth extends JPanel {
    private TituloPanelInformacion tpi;
    private infoPanel p;
    private ExitButton eb;
    private Practica_Final_Model model;
    
    /**
     * Constructor de la clase.
     * @param model model
     */
    public InformacionPanelSouth(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        tpi = new TituloPanelInformacion();
        p = new infoPanel(model);
        eb = new ExitButton();
        
        this.add(tpi, BorderLayout.NORTH);
        this.add(p, BorderLayout.CENTER);
        this.add(eb, BorderLayout.SOUTH);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        eb.setActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder al panel de informacion.
     * @return p
     */
    public infoPanel getEstado() {
        return p;
    }

    /**
     * Metodo get. Metodo para acceder a los dos botones finales del frame de configuracion.
     * @return eb
     */
    public ExitButton getEb() {
        return eb;
    } 
}
