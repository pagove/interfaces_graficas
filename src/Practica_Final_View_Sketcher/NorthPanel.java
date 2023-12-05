/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class NorthPanel extends JPanel {
    private DegradadoPanel degradadoPanel;
    private SelectPanel2 selectPanel2;
    private NorthButtons buttons;
    private Practica_Final_Model model;

    /**
     * Constructor de la clase.
     * @param model model
     */
    public NorthPanel(Practica_Final_Model model) {
        
        this.setLayout(new FlowLayout(0, 60, 0));
        //this.setLayout(new GridLayout(1, 3, WIDTH, WIDTH));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        degradadoPanel = new DegradadoPanel(model);
        selectPanel2 = new SelectPanel2();
        buttons = new NorthButtons();
        
        this.add(degradadoPanel);
        this.add(selectPanel2);
        this.add(buttons);
    }
    
    /**
     *
     * @param etiqueta etiqueta
     * @param actionListener actionListener
     */
    public void setActionListener (String etiqueta, ActionListener actionListener){
        buttons.setActionListener(actionListener);
        degradadoPanel.setActionListener(actionListener);
        
        switch(etiqueta){
            case "Color 1: ":
                selectPanel2.setActionListenerC1(actionListener);
                break;
            case "Color 2: ":
                selectPanel2.setActionListenerC2(actionListener);
                break;
            case "northButtons":
                buttons.setActionListener(actionListener);
                break;
        }
        
        
    }

    /**
     * Metodo get. Metodo para acceder a la clae "NorthButtons".
     * @return buttons.
     */
    public NorthButtons getButtons() {
        return buttons;
    }
    
    /**
     *
     * @return degradadoPanel
     */
    public DegradadoPanel getDegradadoPanel() {
        return degradadoPanel;
    }

    /**
     * Metodo get. Metodo para acceder al selectpanel.
     * @return selectPanel2.
     */
    public SelectPanel2 getSelectPanel2() {
        return selectPanel2;
    }
    
    
    
}
