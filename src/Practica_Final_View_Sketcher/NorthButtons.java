/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
public class NorthButtons extends JPanel {
    private String[] cadenaBox = {"Linea", "Circulo", "Circunferencia"};
    private JComboBox comboBox;
    private JButton configuracion;
    private JButton cargar;
    private JButton guardar;
    private JButton  nuevo;
    private JButton defecto;

    /**
     * Constructor de la clase.
     */
    public NorthButtons() {
        
        this.setLayout(new GridLayout(3, 2, 20, 20));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        comboBox = new JComboBox(cadenaBox);
        comboBox.setFont(new Font("Sans", Font.BOLD, 15));
        comboBox.setActionCommand("comboBoxFiguras");
        
        
        configuracion = new JButton("Configuracion");
        configuracion.setFont(new Font("Sans", Font.BOLD, 15));
        configuracion.setActionCommand("configurationSketButton");
        
        cargar = new JButton("Cargar imagen");
        cargar.setFont(new Font("Sans", Font.BOLD, 15));
        cargar.setActionCommand("cargarSketButton");
        
        guardar = new JButton("Guardar imagen");
        guardar.setFont(new Font("Sans", Font.BOLD, 15));
        guardar.setActionCommand("guardarSketButton");
        
        nuevo = new JButton("Nuevo");
        nuevo.setFont(new Font("Sans", Font.BOLD, 15));
        nuevo.setActionCommand("nuevoSketButton");
        
        defecto = new JButton("Conf. Defecto");
        defecto.setFont(new Font("Sans", Font.BOLD, 15));
        defecto.setActionCommand("defectoSketButotn");
        
        this.add(comboBox);
        this.add(configuracion);
        this.add(cargar);
        this.add(guardar);
        this.add(nuevo);
        this.add(defecto);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        configuracion.addActionListener(actionListener);
        cargar.addActionListener(actionListener);
        guardar.addActionListener(actionListener);
        nuevo.addActionListener(actionListener);
        defecto.addActionListener(actionListener);
        comboBox.addActionListener(actionListener);
    }

    /**
     * Metodo get. Metodo para acceder a la clase "JComboBoxPanel".
     * @return comboBox
     */
    public JComboBox getComboBox() {
        return comboBox;
    }
    
    
    
    
}
