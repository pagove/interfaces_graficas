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
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class infoPanel extends JPanel {
    private JLabel degradado;
    private JLabel valDegradado;
    private JLabel grosor;
    private JLabel valGrosor;
    private JLabel color1;
    private JTextField valColor1;
    private JLabel color2;
    private JTextField valColor2;
    
    private Practica_Final_Model model;

    /**
     *
     * @param model model
     */
    public infoPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new GridLayout(1, 8, 5, 0));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        degradado = new JLabel("Degradado: ");
        degradado.setFont(new Font("Sans", Font.BOLD, 15));
        valDegradado = new JLabel("SI");
        valDegradado.setFont(new Font("Sans", Font.BOLD, 15));
        
        grosor = new JLabel("Grosor: ");
        grosor.setFont(new Font("Sans", Font.BOLD, 15));
        valGrosor = new JLabel(String.valueOf(model.getGrosorDefecto()));
        valGrosor.setFont(new Font("Sans", Font.BOLD, 15) );
        
        color1 = new JLabel("Color 1: ");
        color1.setFont(new Font("Sans", Font.BOLD, 15));
        valColor1 = new JTextField();
        valColor1.setBackground(model.getC1Defecto());
        
        color2 = new JLabel("Color 2: ");
        color2.setFont(new Font("sans", Font.BOLD, 15));
        valColor2 = new JTextField();
        valColor2.setBackground(model.getC2Defecto());
        
        this.add(degradado);
        this.add(valDegradado);
        this.add(grosor);
        this.add(valGrosor);
        this.add(color1);
        this.add(valColor1);
        this.add(color2);
        this.add(valColor2);
    }
    
    /**
     *
     * @param color color
     */
    public void setColor1(Color color){
        valColor1.setBackground(color);
    }
    
    /**
     *
     * @param color color
     */
    public void setColor2(Color color){
        valColor2.setBackground(color);
    }
    
    /**
     *
     * @param grosor grosor
     */
    public void setGrosor(int grosor){
        valGrosor.setText(String.valueOf(grosor));
    }

    /**
     *
     * @param degradado degradado
     */
    public void setDegradado(boolean degradado) {
        if (degradado){
            valDegradado.setText("SI");
        }
        else{
            valDegradado.setText("NO");
        }
    }

    /**
     *
     * @param valColor1 valColor1
     */
    public void setValColor1(JTextField valColor1) {
        this.valColor1 = valColor1;
    }

    /**
     *
     * @param valColor2 valColor2
     */
    public void setValColor2(JTextField valColor2) {
        this.valColor2 = valColor2;
    }

    /**
     *
     * @return valColor1
     */
    public JTextField getValColor1() {
        return valColor1;
    }

    /**
     *
     * @return valColor2
     */
    public JTextField getValColor2() {
        return valColor2;
    }
    
    
    
    
    
    
    
}
