/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class SelectPanel2 extends JPanel {
    private ColorPanel2 c1;
    private ColorPanel2 c2;

    /**
     * COnstructor de la clase.
     */
    public SelectPanel2() {
        
        this.setLayout(new GridLayout(1, 2, 20, 20));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        c1 = new ColorPanel2("Color 1: ");
        c2 = new ColorPanel2("Color 2: ");
        
        this.add(c1);
        this.add(c2);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListenerC1 (ActionListener actionListener){
        c1.setActionListener(actionListener);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListenerC2 (ActionListener actionListener){
        c2.setActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder al color 1.
     * @return c1
     */
    public ColorPanel2 getC1() {
        return c1;
    }

    /**
     * Metodo get. Metodo para acceder al color 2.
     * @return c2
     */
    public ColorPanel2 getC2() {
        return c2;
    }
    
}
