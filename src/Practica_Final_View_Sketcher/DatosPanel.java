/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import Practica_Final_Model.Practica_Final_Model;
import java.awt.Color;
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
public class DatosPanel extends JPanel{
    private JLabel degradado;
    private JLabel rDegradado;
    private JLabel c1;
    private JTextFieldPanel rC1;
    private JLabel c2;
    private JTextFieldPanel rC2;
    private JLabel grosor;
    private JLabel rGrosor;
    private JLabel numLineas;
    private JLabel rNumLineas;
    private JLabel numCirculo;
    private JLabel rNumCirculo;
    private JLabel numCircunferencia;
    private JLabel rNumCircunferencia;
    private Practica_Final_Model model;

    /**
     * Constructor de la clase.
     * @param model model
     */
    public DatosPanel(Practica_Final_Model model) {
        
        this.model = model;
        
        this.setLayout(new GridLayout(7, 2, 10, 10));
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        degradado = new JLabel("Degradado: ");
        degradado.setFont(new Font("Sans", Font.BOLD, 20));
        
        rDegradado = new JLabel("SI");
        rDegradado.setFont(new Font("Sans", Font.BOLD, 15));
        
        c1 = new JLabel("Color 1: ");
        c1.setFont(new Font("Sans", Font.BOLD, 20));
        
        if(model.isConfiguracionDefectoActivada()){
            rC1 = new JTextFieldPanel(model.getC1Defecto());
        }else{
            rC1 = new JTextFieldPanel(model.getC1());
        }
        
        c2 = new JLabel("Color 2: ");
        c2.setFont(new Font("Sans", Font.BOLD, 20));
        
        if(model.isConfiguracionDefectoActivada()){
            rC2 = new JTextFieldPanel(model.getC2Defecto());
        }else{
            rC2 = new JTextFieldPanel(model.getC2());
        }
        
        grosor = new JLabel("Grosor: ");
        grosor.setFont(new Font("Sans", Font.BOLD, 20));
        
        
        rGrosor = new JLabel(String.valueOf(model.getGrosor()));
        rGrosor.setFont(new Font("Sans", Font.BOLD, 15));
        
        numLineas = new JLabel("Nº lineas: ");
        numLineas.setFont(new Font("Sans", Font.BOLD, 20));
        
        rNumLineas = new JLabel(String.valueOf(model.getNumLineas()));
        rNumLineas.setFont(new Font("Sans", Font.BOLD, 15));
        
        numCirculo = new JLabel("Nº Circulos: ");
        numCirculo.setFont(new Font("Sans", Font.BOLD, 20));
        
        rNumCirculo = new JLabel(String.valueOf(model.getNumCirculo()));
        rNumCirculo.setFont(new Font("Sans", Font.BOLD, 15));
        
        numCircunferencia = new JLabel("Nº Circunferencia: ");
        numCircunferencia.setFont(new Font("Sans", Font.BOLD, 20));
        
        rNumCircunferencia = new JLabel(String.valueOf(model.getNumCircunferencias()));
        rNumCircunferencia.setFont(new Font("Sans", Font.BOLD, 15));
        
        this.add(degradado);
        this.add(rDegradado);
        this.add(c1);
        this.add(rC1);
        this.add(c2);
        this.add(rC2);
        this.add(grosor);
        this.add(rGrosor);
        this.add(numLineas);
        this.add(rNumLineas);
        this.add(numCirculo);
        this.add(rNumCirculo);
        this.add(numCircunferencia);
        this.add(rNumCircunferencia);
    }
    
    /**
     * Metodo set. Metodo para guardar si hay degradado o no.
     * @param degradado degradado
     */
    public void setDegradado(boolean degradado) {
        if (degradado){
            rDegradado.setText("SI");
        }
        else{
            rDegradado.setText("NO");
        }
    }

    /**
     * Metodo set. Metodo para guardar el color 1.
     * @param c1 c1
     */
    public void setrC1(Color c1) {
        rC1.setTextField(c1);
    }

    /**
     *
     * @param C2 C2
     */
    public void setrC2(Color C2) {
        rC2.setTextField(C2);
    }

    /**
     * Metodo set. Metodo para mostrar o no el color 2.
     * @param visible visible
     */
    public void setrC2Visible(boolean visible) {
        if(visible){
           this. rC2.setVisible(visible);
        }else{
            this.rC2.setVisible(visible);
        }
        
    }
    
    /**
     * Metodo get. Metodo para acceder al color 1.
     * @return rC1
     */
    public JTextFieldPanel getrC1() {
        return rC1;
    }

    /**
     * Metodo get. Metodo para acceder al color 2.
     * @return rC2.
     */
    public JTextFieldPanel getrC2() {
        return rC2;
    }

    /**
     * Metodo set. Metodo para guardar el grosor.
     * @param grosor grosor
     */
    public void setrGrosor(int grosor){
        rGrosor.setText(String.valueOf(grosor));
    }

    /**
     * Metodo set. Metodo para guardar el numero de lineas.
     * @param valor valor
     */
    public void setrNumLineas(int valor) {
        rNumLineas.setText(String.valueOf(valor));
    }

    /**
     * Metodo set. Metodo para guardar el numero de circulos.
     * @param  valor valor
     */
    public void setrNumCirculo(int valor) {
        rNumCirculo.setText(String.valueOf(valor));
    }

    /**
     * Metodo set. Metodo para guardar el numero de circunferencias.
     * @param valor valor
     */
    public void setrNumCircunferencia(int valor) {
        rNumCircunferencia.setText(String.valueOf(valor));
    }
}
