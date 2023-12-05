/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pablo
 */
public class Slider extends JPanel {
    private Practica_Final_Model model;
    private JSlider slider;
    private JLabel titulo;
    private Hashtable hashtable;

    /**
     * Constructor de la clase.
     */
    public Slider() {
        
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        titulo = new JLabel("Selecciona el grosor: ");
        titulo.setFont(new Font("Sans", Font.BOLD, 15));
        titulo.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        
        slider = new JSlider(1, 100, 50);
        slider.setPaintLabels(true);
        
        hashtable = new Hashtable();
        
        for (int i = 0; i < 110; i = i + 10) {
            hashtable.put(i, new JLabel(String.valueOf(i)));
        }
        
        slider.setLabelTable(hashtable);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        
        this.add(titulo, BorderLayout.NORTH);
        this.add(slider, BorderLayout.CENTER);
    }
    
    /**
     *
     * @param changeListener changeListener 
     */
    public void setChangeListner (ChangeListener changeListener){
        slider.addChangeListener(changeListener);
    }

    /**
     * Metodo get. Metodo para acceder al metodos del slider.
     * @return slider.
     */
    public JSlider getSlider() {
        return slider;
    }
    
    
     
}
