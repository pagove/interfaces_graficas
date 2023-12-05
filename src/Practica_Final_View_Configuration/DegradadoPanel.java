/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import Practica_Final_Model.Practica_Final_Model;
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
public class DegradadoPanel extends JPanel {
    private JLabel label;
    private JRadioButton si; //Boton de eleccion si.
    private JRadioButton no; //Boton de eleccion no.
    private ButtonGroup bg;
    private Practica_Final_Model model;
    
    /**
     * Constructor de la clase.
     * @param model model
     */
    public DegradadoPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new FlowLayout(WIDTH, 100, WIDTH));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        label = new JLabel("Degradado: ");
        label.setFont(new Font("Sans", Font.BOLD, 25));
        
        bg = new ButtonGroup();
        
        si = new JRadioButton("SI");
        si.setFont(new Font("Sans", Font.BOLD, 15));
        si.setActionCommand("siDegradadoConf");
        
        no = new JRadioButton("NO");
        no.setFont(new Font("Sans", Font.BOLD, 15));
        no.setActionCommand("noDegradadoConf");
        
        bg.add(si);
        bg.add(no);
        
        if (model.isDegradadoDefecto()){
            si.setSelected(true);
        }
        else{
            no.setSelected(true);
        }
        
        this.add(label);
        this.add(si);
        this.add(no);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        no.addActionListener(actionListener);
        si.addActionListener(actionListener);
    }
    
}
