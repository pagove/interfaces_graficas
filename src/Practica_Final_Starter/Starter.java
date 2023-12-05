/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_Starter;

import Practica_Final_Controller.Practica_Final_Controller;
import Practica_Final_Model.Practica_Final_Model;
import Practica_Final_View_Configuration.ConfigurationFrame;
import Practica_Final_View_Sketcher.SketcherFrame;

/**
 *
 * @author pablo
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Practica_Final_Model model = new Practica_Final_Model();
        ConfigurationFrame cp = new ConfigurationFrame(model);
        SketcherFrame sp = new SketcherFrame(model);
        Practica_Final_Controller controlador = new Practica_Final_Controller(model, cp, sp);
        
        cp.setVisible(true);
        sp.setVisible(false);
    }
}