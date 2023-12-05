/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class JTextFieldPanel extends JPanel {
    private Color color;
    private JTextField textField;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    
    /**
     * Constructor de la clase.
     * @param color color
     */
    public JTextFieldPanel(Color color) {
        this.color = color;
        
        this.setLayout(new GridLayout(3, 3, 5, 5));
        
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBackground(color);
        
        label1 = new JLabel("");
        label2 = new JLabel("");
        label3 = new JLabel("");
        label4 = new JLabel("");
        label5 = new JLabel("");
        label6 = new JLabel("");
        label7 = new JLabel("");
        label8 = new JLabel("");
        
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(textField);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);        
        
    }

    /**
     * Metodo set. Metodo para guardar el color.
     * @param c c
     */
    public void setTextField(Color c) {
        textField.setBackground(c);
    }

    /**
     * Metodo get. Metodo para acceder al color del textfile.
     * @return textField.
     */
    public JTextField getTextField() {
        return textField;
    }
    
    
    
    
}
