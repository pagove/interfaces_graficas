/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pablo
 */
public class ConfigurationFrame extends JFrame {
    private SelectPanelCenter selectPanel;
    private NorthPanel northPanel;
    private InformacionPanelSouth ips;
    private ConfiguracionMenu cm;
    private Practica_Final_Model model;
    
    /**
     * Constructor de la clase
     * @param model model
     */
    public ConfigurationFrame(Practica_Final_Model model) {
        this.model = model;
        
        this.setSize(800, 700); // Poner Tamaño de la ventana
        this.setLayout(new BorderLayout()); //distribucion
        this.setVisible(true);
        this.setTitle("Ventana configuracion");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        selectPanel = new SelectPanelCenter();
        northPanel = new NorthPanel(model);
        ips = new InformacionPanelSouth(model);
        cm = new ConfiguracionMenu();
        
        this.setJMenuBar(cm);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(selectPanel, BorderLayout.CENTER);
        this.add(ips, BorderLayout.SOUTH);
    }

    /**
     * @param etiqueta etiqueta
     * @param actionListener actionListener
     */
    public void setActionListener (String etiqueta, ActionListener actionListener){
        switch(etiqueta){
            case "Color 1: ":
                selectPanel.setActionListenerC1(actionListener);
                break;
            case "Color 2: ":
                selectPanel.setActionListenerC2(actionListener);
                break;
            case "JMenu":
                cm.setActionListener(actionListener);
                break;
            case "JRadioButton":
                northPanel.setActionListener(actionListener);
                break;
            case "JButton":
            case "JComboBox":
                ips.setActionListener(actionListener);
                break;
                
        }       
    }
    
    /**
     * @param  changeListener changeListener
     */
    public void setChangeListener (ChangeListener changeListener){
        northPanel.setChangeListener(changeListener);
    }

    /**
      Metodo get. Metodo para acceder al panel "Informacion panel south".
     * @return ips;
     */
    public InformacionPanelSouth getIps() {
        return ips;
    }

    /**
     * Metodo get. Metodo para acceder al "Select panel".
     * @return selectPanel
     */
    public SelectPanelCenter getSelectPanel() {
        return selectPanel;
    }
    
    
    
    
    
}
