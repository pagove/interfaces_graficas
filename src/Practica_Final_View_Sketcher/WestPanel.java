/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import Practica_Final_View_Configuration.TituloPanelInformacion;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class WestPanel extends JPanel{
    private TituloInformacionPanel2 informacionPanel;
    private DatosPanel datosPanel;
    private Practica_Final_Model model;

    /**
     * Constructor de la clase.
     * @param model model
     */
    public WestPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        informacionPanel = new TituloInformacionPanel2();
        datosPanel = new DatosPanel(model);
        
        this.add(informacionPanel, BorderLayout.NORTH);
        this.add(datosPanel, BorderLayout.CENTER);
    }

    /**
     * Metodo get. Metodo para acceder  a los datos del panel izquierdo.
     * @return datosPanel.
     */
    public DatosPanel getDatosPanel() {
        return datosPanel;
    }
    
    
}
