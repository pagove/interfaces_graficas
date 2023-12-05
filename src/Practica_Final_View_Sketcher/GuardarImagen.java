/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author pablo
 */
public class GuardarImagen extends JFileChooser {

    /**
     * Constructor de la clase
     */
    public GuardarImagen() {
        super();
        this.setFileSelectionMode(JFileChooser.FILES_ONLY);
        this.setDialogType(JFileChooser.SAVE_DIALOG);
        this.setVisible(true);
    }
  
    /**
     * Metodo get.
     * @return null
     */
    public File getFile() {
        int ret = showDialog(null, "Guardar imagen");

        if (ret == JFileChooser.APPROVE_OPTION) {
            return getSelectedFile();
        }
        else {
            return null;
        }
    }
}
