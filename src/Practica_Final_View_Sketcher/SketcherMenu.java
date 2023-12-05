/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author pablo
 */
public class SketcherMenu extends JMenuBar {
    private JMenu menu;
    private JMenuItem Configuracion;
    private JMenuItem cargar;
    private JMenuItem guardar;
    private JMenuItem salir;

    /**
     * Constructor de la clase.
     */
    public SketcherMenu() {
        
        menu = new JMenu("Menu");
        
        Configuracion = new JMenuItem("Ventana configuracion");
        Configuracion.setActionCommand("configuracionItemSket");
        
        cargar = new JMenuItem("Cargar imagen");
        cargar.setActionCommand("cargarImagenItemSket");
        
        guardar = new JMenuItem("Guardar imagen");
        guardar.setActionCommand("guardarImagenItemSket");
        
        salir = new JMenuItem("Salir");
        salir.setActionCommand("salirItemSket");
        
        menu.add(Configuracion);
        menu.add(cargar);
        menu.add(guardar);
        menu.add(salir);
        
        this.add(menu);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        Configuracion.addActionListener(actionListener);
        cargar.addActionListener(actionListener);
        guardar.addActionListener(actionListener);
        salir.addActionListener(actionListener);
    }
}
