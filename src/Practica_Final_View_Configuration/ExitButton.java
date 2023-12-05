/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author pablo
 */
public class ExitButton extends JPanel {
    private String[] figuras = {"Linea", "Circunferencia", "Circulo"};
    private JComboBox <String> comboFiguras;
    private JButton sketcher;

    /**
     * Constructor de la clase.
     */
    public ExitButton() {
        
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setBorder(new EmptyBorder(10, WIDTH, WIDTH, WIDTH));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        comboFiguras = new JComboBox(figuras);
        sketcher = new JButton("Sketcher");
        
        comboFiguras.setActionCommand("figurasComboConfiComand");
        sketcher.setActionCommand("sketcherButtonConfiComand");
        
        this.add(comboFiguras);
        this.add(sketcher);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        comboFiguras.addActionListener(actionListener);
        sketcher.addActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder a los parametros del combo box.
     * @return comboFiguras.
     */
    public JComboBox<String> getComboFiguras() {
        return comboFiguras;
    }
    
    
}
