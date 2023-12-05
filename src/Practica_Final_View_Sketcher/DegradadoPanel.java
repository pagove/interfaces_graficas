/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class DegradadoPanel extends JPanel {
    private DegradadoTituloPanel titulo;
    private DegradadoButtons buttons;
    private Practica_Final_Model model;

    /**
     * Constructor de la clase.
     * @param model model
     */
    public DegradadoPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        titulo = new DegradadoTituloPanel();
        buttons = new DegradadoButtons(model);
        
        this.add(titulo, BorderLayout.NORTH);
        this.add(buttons, BorderLayout.CENTER);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        buttons.setActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder a la clase "button".
     * @return buttons
     */
    public DegradadoButtons getButtons() {
        return buttons;
    }
    
    
    
}
