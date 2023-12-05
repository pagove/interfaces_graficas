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
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author pablo
 */
public class DegradadoButtons extends JPanel{
    private JRadioButton si;
    private JRadioButton no;
    private ButtonGroup bg;
    private Practica_Final_Model model;
    
    /**
     * Constructor de la clase.
     * @param model model
     */
    public DegradadoButtons(Practica_Final_Model model) {
        
        this.model = model;
        this.setLayout(new FlowLayout());
        
        si = new JRadioButton("SI");
        si.setFont(new Font("Sans", Font.BOLD, 20));
        si.setActionCommand("siDegradadoButtonsket");
        
        no = new JRadioButton("NO");
        no.setFont(new Font("Sans", Font.BOLD, 20));
        no.setActionCommand("noDegradadoButtonsket");
        
        bg = new ButtonGroup();
        
        bg.add(si);
        bg.add(no);
        
        if (model.isDegradado()){
            si.setSelected(true);
        }
        else{
            no.setSelected(true);
        }
        
        this.add(si);
        this.add(no);
    }  
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        si.addActionListener(actionListener);
        no.addActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder al boton si.
     * @return si
     */
    public JRadioButton getSi() {
        return si;
    }

    /**
     * Metodo get. Metodo para acceder al boton no.
     * @return no
     */
    public JRadioButton getNo() {
        return no;
    }
    
    
}
