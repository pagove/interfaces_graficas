/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author pablo
 */
public class SelectPanelCenter extends JPanel {
    private ColorPanel c1;
    private ColorPanel c2;
       
    /**
     * Constructor de la clase.
     */
    public SelectPanelCenter() {
    
        this.setLayout(new GridLayout(1, 2, 20, 20));
        this.setBorder(new EmptyBorder(20, 75, 20, 75));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        c1 = new ColorPanel("Color 1: ");
        c1.setFont(new Font("Sans", Font.BOLD, 10));
        c2 = new ColorPanel("Color 2: ");
        c2.setFont(new Font("Sans", Font.BOLD, 10));
        
        this.add(c1);
        this.add(c2);
    }

    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListenerC1 (ActionListener actionListener){
        c1.setActionListener(actionListener);;
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListenerC2 (ActionListener actionListener){
        c2.setActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder al color 2.
     * @return c2
     */
    public ColorPanel getC2() {
        return c2;
    }
    
    
}
