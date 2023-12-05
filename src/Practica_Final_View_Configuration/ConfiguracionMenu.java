/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Configuration;

import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author pablo
 */
public class ConfiguracionMenu extends JMenuBar{
    private JMenu menu;
    private JMenu info;
    private JMenuItem salir;
    private JMenuItem sketcher;
    private JMenuItem trabajo;

    /**
     * Constructor de la clase
     */
    public ConfiguracionMenu() {
        
        menu = new JMenu("Menu");
        sketcher = new JMenuItem("Ventana Sketcher");
        sketcher.setActionCommand("sketcherItem");
        
        salir = new JMenuItem("Salir");
        salir.setActionCommand("salirItem");
       
        menu.add(sketcher);
        menu.add(salir);
        
        info = new JMenu("Informacion");
        trabajo = new JMenuItem("Informacion del trabajo");
        trabajo.setActionCommand("trabajoItem");
        
        info.add(trabajo);
        
        
        this.add(menu);
        this.add(info);
    }
    
    /**
     *
     * @param actionListener actionListener
     */
    public void setActionListener (ActionListener actionListener){
        //guardar.addActionListener(actionListener);
        sketcher.addActionListener(actionListener);
        salir.addActionListener(actionListener);
        trabajo.addActionListener(actionListener);
    }   
}
