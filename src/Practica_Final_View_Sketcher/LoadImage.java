/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_View_Sketcher;

/**
 *
 * @author pablo
 */
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pablo
 */
public class LoadImage extends JFileChooser {
    
    private static final String[] EXTENSIONES = { "jpg", "jpeg", "png", "gif",
        "tiff", "JPG", "JPEG" };
    
    /**
     * Constructor de la clase.
     */
    public LoadImage() {
        super();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Imágenes", EXTENSIONES);
        this.setFileSelectionMode(JFileChooser.FILES_ONLY);
        this.setDialogType(JFileChooser.OPEN_DIALOG);
        this.setFileFilter(extensionFilter);
        this.setVisible(true);
    }
  
    /**
     * Metodo get.
     * @return null
     */
    public File getFile() {
        int ret = showDialog(null, "Abrir imagen");

        if (ret == JFileChooser.APPROVE_OPTION) {
            return getSelectedFile();
        }
        else {
            return null;
        }
    }
}