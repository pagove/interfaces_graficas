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
import javax.swing.event.ChangeListener;

/**
 *
 * @author pablo
 */
public class NorthPanel extends JPanel {
    private Slider slider;
    private DegradadoPanel dp;
    private Practica_Final_Model model;
    
    /**
     * Constructor de la clase.
     * @param model model
     */
    public NorthPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        slider = new Slider();
        dp = new DegradadoPanel(model);
        
        this.add(slider, BorderLayout.CENTER);
        this.add(dp, BorderLayout.NORTH);
    
    }
    
    /**
     * Listener de slider.
     * @param changeListener changeListener
     */
    public void setChangeListener (ChangeListener changeListener){
        slider.setChangeListner(changeListener);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        dp.setActionListener(actionListener);
    }
}
