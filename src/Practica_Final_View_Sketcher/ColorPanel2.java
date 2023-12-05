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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class ColorPanel2 extends JPanel {
    private Color[] colorFondo = {Color.BLACK, Color.CYAN, Color.YELLOW, Color.BLUE, Color.ORANGE, Color.GREEN, Color.PINK, Color.WHITE, Color.RED, Color.GRAY,  Color.MAGENTA};
    private String[] nombreColor = { "Negro", "Cyan", "Amarillo", "Azul", "Naranja", "Verde", "Rosa", "Blanco", "Rojo", "Gris", "Magenta"};
    private JButton[] buttons;
    private JLabel etiqueta; // Primer elemento del gridlayout
    private String etiquetaNombre; // Nombre del Label anterior.

    /**
     * Constructor de la clase.
     * @param etiquetaNombre etiquetaNombre
     */
    public ColorPanel2(String etiquetaNombre) {
        
        this.etiquetaNombre = etiquetaNombre;
        
        this.setLayout(new GridLayout(3, 4, 5, 5));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        etiqueta = new JLabel(etiquetaNombre);
        etiqueta.setFont(new Font("Sans", Font.BOLD, 20));
        
         buttons = new JButton[11];
        
        for (int i = 0; i < 11; i++) {
            buttons[i] = new JButton(nombreColor[i]);
            buttons[i].setBackground(colorFondo[i]);
            buttons[i].setActionCommand("butonsSketCommand" + i);
        }
        
        buttons[0].setForeground(Color.WHITE); // Para que se puedan leer las letras del primer boton
        buttons[3].setForeground(Color.WHITE);
        buttons[9].setForeground(Color.WHITE);
        
        this.add(etiqueta);
        
        for (int i = 0; i < 11; i++) {
            this.add(buttons[i]);
        } 
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        for (int i = 0; i < 11; i++) {
            buttons[i].addActionListener(actionListener);
        }
    }
}

