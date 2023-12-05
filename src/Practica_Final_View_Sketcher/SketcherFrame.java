/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import Practica_Final_View_Configuration.Slider;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pablo
 */
public class SketcherFrame extends JFrame{
    private Practica_Final_Model model;
    private GraphicsPanel graphicsPanel; 
    private NorthPanel northPanel;
    private Slider slider;
    private WestPanel westPanel;
    private SketcherMenu sketcherMenu;
    
    /**
     * Constructor de la clase.
     * @param model model.
     */
    public SketcherFrame(Practica_Final_Model model) {
        this.model = model;
        
        this.setTitle("Ventana Sketcher");
        this.setSize(1600,1000);
        this.setVisible(false);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        
        graphicsPanel = new GraphicsPanel(model);
        northPanel = new NorthPanel(model);
        slider = new Slider();
        westPanel = new WestPanel(model);
        sketcherMenu = new SketcherMenu();
        
        this.add(graphicsPanel, BorderLayout.CENTER);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(slider, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.setJMenuBar(sketcherMenu);
        
    } 
    
    /**
     *
     * @param etiqueta etiqueta
     * @param actionListener actionListener
     */
    public void setActionListener(String etiqueta, ActionListener actionListener){
        switch(etiqueta){
            case "menuSket":
                sketcherMenu.setActionListener(actionListener);
                break;
            case "degradadosket":
            case "Color 1: ":
            case "Color 2: ":
            case "northButtons":
                northPanel.setActionListener(etiqueta, actionListener);
                break;    
            }
    }
    
    /**
     *
     * @param changeListener changeListener
     */
    public void setChangeListener (ChangeListener changeListener){
        slider.setChangeListner(changeListener);
    }
    
    /**
     *
     * @param mouseListener mouseListener
     */
    public void setMouseListener (MouseListener mouseListener){
        graphicsPanel.addMouseListener(mouseListener);
    }
    
    /**
     * Metodo get. Metodo para acceder al panel izquierdo.
     * @return westPanel
     */
    public WestPanel getWestPanel() {
        return westPanel;
    }
    
    /**
     * Metodo get. Metodo para acceder al panel del norte.
     * @return northPanel
     */
    public NorthPanel getNorthPanel() {
        return northPanel;
    }

    /**
     * Metodo get. Metodo para acceder al panel del graphics.
     * @return graphicsPanel
     */
    public GraphicsPanel getGraphicsPanel() {
        return graphicsPanel;
    }

    /**
     * Metodo get. Metodo para acceder al slider.
     * @return slider
     */
    public Slider getSlider() {
        return slider;
    }    
}
