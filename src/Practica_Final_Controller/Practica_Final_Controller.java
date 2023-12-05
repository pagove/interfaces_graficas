/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_Controller;

import Practica_Final_Model.Practica_Final_Model;
import static Practica_Final_Model.Practica_Final_Model.FIGURA_CIRCULO;
import static Practica_Final_Model.Practica_Final_Model.FIGURA_CIRCUNFERENCIA;
import static Practica_Final_Model.Practica_Final_Model.FIGURA_LINEA;
import Practica_Final_View_Configuration.ConfigurationFrame;
import Practica_Final_View_Sketcher.GuardarImagen;
import Practica_Final_View_Sketcher.LoadImage;
import Practica_Final_View_Sketcher.SketcherFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pablo
 */
public class Practica_Final_Controller {
    
    /**
     * Declaracion de variables.
     */
    private Practica_Final_Model model;
    private ConfigurationFrame configurationFrame;  
    private SketcherFrame sketcherFrame;
    private LoadImage lImage;
    private GuardarImagen guardarImagen;
    private GuardarImagen guardarImagen1;
    
    
    /**
     *  Constructor de la clase modelo.
     * 
     * @param model Modelo de la practica.
     * @param configurationFrame Ventana principal (frame) de la ventana de configuracion.
     * @param sketcherFrame  Ventana principal (frame) de la ventana de Sketcher.
     */
    public Practica_Final_Controller(Practica_Final_Model model, ConfigurationFrame configurationFrame, SketcherFrame sketcherFrame) {
        this.model = model;
        this.configurationFrame = configurationFrame;
        this.sketcherFrame = sketcherFrame;
        
        lImage = new LoadImage();
        guardarImagen = new GuardarImagen();
        
        configurationFrame.setActionListener("JRadioButton", new ControllerActionListenerConf("JRadioButton"));
        configurationFrame.setActionListener("Color 1: ", new ControllerActionListenerConf("Color 1: "));
        configurationFrame.setActionListener("Color 2: ", new ControllerActionListenerConf("Color 2: "));
        configurationFrame.setActionListener("JButton", new ControllerActionListenerConf("JButton"));
        configurationFrame.setActionListener("JComboBox", new ControllerActionListenerConf("JComboBox"));
        configurationFrame.setActionListener("JMenu", new ControllerActionListenerConf("JMenu"));
        
        configurationFrame.setChangeListener(new ControllerChangeListenerConf());
        
        
        sketcherFrame.setActionListener("menuSket", new ControllerActionListenerSketcher("menuSket"));
        sketcherFrame.setActionListener("degradadosket", new ControllerActionListenerSketcher("degradadosket"));
        sketcherFrame.setActionListener("Color 1: ", new ControllerActionListenerSketcher("Color 1: "));
        sketcherFrame.setActionListener("Color 2: ", new ControllerActionListenerSketcher("Color 2: "));
        sketcherFrame.setActionListener("northButtons", new ControllerActionListenerSketcher("northButtons"));
        
        sketcherFrame.setChangeListener(new ControllerChangeListenerSket());
        
        sketcherFrame.setMouseListener(new ControllerMyMouseListener());
        
    }
    
    /**
     * Clase empotrada, controlador de Action Listeners de la ventana configuracion.
     */
    class ControllerActionListenerConf implements ActionListener {
        
        private String informacion = "      Trabajo final de Entornos de usuario.       \n"
                + "Trabajo realizado por Pablo Gomar Velló y Alejandro Mir.\n\n"
                + "     Tareas      \n"
                + "Hacer ventana configuracion 20-12-18 - 24-12-18. \n"
                + "Hacer ventana sketcher 26-12-18 - 29-12-28. \n"
                + "Poner Listener en clases de configuracion 30-12-18. \n"
                + "Hacer el controlador de la ventana de configuracion 31-12-18. \n"
                + "Poner Listeners en clases de Skecther 2-1-19.\n"
                + "Hacer Controller de ventana Sketcher 02-01-19 - 03-01-19. \n"
                + "Arreglar pequeños errores. 04-01-09. \n"
                + "Documentar programa y hacer memoria 04-01-09.";
        private JRadioButton radioButton;
        private String etiqueta;
        private JButton button;
        private JComboBox comboBox;
        
        public ControllerActionListenerConf(String etiqueta) {
            
            this.etiqueta = etiqueta;    
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            
            if (etiqueta == "JRadioButton"){
                switch(command){
                case "siDegradadoConf":
                    radioButton = (JRadioButton) ae.getSource();
                    model.setDegradadoDefecto(true);
                    configurationFrame.getIps().getEstado().setDegradado(model.isDegradadoDefecto());
                    configurationFrame.getSelectPanel().getC2().setVisible(true);
                    configurationFrame.getIps().getEstado().getValColor2().setVisible(true);
                    configurationFrame.getIps().getEstado().getValColor1().setVisible(true);
                    sketcherFrame.getWestPanel().getDatosPanel().setDegradado(model.isDegradadoDefecto());
                    sketcherFrame.getNorthPanel().getSelectPanel2().getC2().setVisible(true);
                    sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getSi().setSelected(true);
                    sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getNo().setSelected(false);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC2().setVisible(true);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC1().setVisible(true);
                    break;
                case "noDegradadoConf":
                    radioButton = (JRadioButton) ae.getSource();
                    model.setDegradadoDefecto(false);
                    configurationFrame.getIps().getEstado().setDegradado(model.isDegradadoDefecto());
                    configurationFrame.getSelectPanel().getC2().setVisible(false);
                    sketcherFrame.getWestPanel().getDatosPanel().setDegradado(model.isDegradadoDefecto());
                    sketcherFrame.getNorthPanel().getSelectPanel2().getC2().setVisible(false);
                    sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getSi().setSelected(false);
                    sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getNo().setSelected(true);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC2().setVisible(false);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC1().setVisible(true);
                    configurationFrame.getIps().getEstado().getValColor2().setVisible(false);
                    configurationFrame.getIps().getEstado().getValColor1().setVisible(true);
                                        
                    break;
                }
            }
            else if (etiqueta == "Color 1: " || etiqueta == "Color 2: "){
                
                switch (command){
                    case "Color 1: butonsConfiCommand0":
                    case "Color 1: butonsConfiCommand1":
                    case "Color 1: butonsConfiCommand2":
                    case "Color 1: butonsConfiCommand3":
                    case "Color 1: butonsConfiCommand4":
                    case "Color 1: butonsConfiCommand5":
                    case "Color 1: butonsConfiCommand6":
                    case "Color 1: butonsConfiCommand7":
                    case "Color 1: butonsConfiCommand8":
                    case "Color 1: butonsConfiCommand9":
                    case "Color 1: butonsConfiCommand10":
                        button = (JButton) ae.getSource();
                        model.setC1Defecto(button.getBackground());
                        configurationFrame.getIps().getEstado().setColor1(model.getC1Defecto());
                        sketcherFrame.getWestPanel().getDatosPanel().setrC1(model.getC1Defecto());
                        break;
                        
                    case "Color 2: butonsConfiCommand0":
                    case "Color 2: butonsConfiCommand1":
                    case "Color 2: butonsConfiCommand2":
                    case "Color 2: butonsConfiCommand3":
                    case "Color 2: butonsConfiCommand4":
                    case "Color 2: butonsConfiCommand5":
                    case "Color 2: butonsConfiCommand6":
                    case "Color 2: butonsConfiCommand7":
                    case "Color 2: butonsConfiCommand8":
                    case "Color 2: butonsConfiCommand9":
                    case "Color 2: butonsConfiCommand10":
                        button = (JButton) ae.getSource();
                        model.setC2Defecto(button.getBackground());
                        configurationFrame.getIps().getEstado().setColor2(model.getC2Defecto());
                        sketcherFrame.getWestPanel().getDatosPanel().setrC2(model.getC2Defecto());
                        break;
                }
            }
            else if (etiqueta == "JButton"){
                switch(command){
                    case "sketcherButtonConfiComand":
                        sketcherFrame.setVisible(true);
                        configurationFrame.setVisible(false);
                        model.setConfiguracionDefectoActivada(true);
                        sketcherFrame.getWestPanel().getDatosPanel().setrGrosor(model.getGrosorDefecto());
                        System.out.println(model.getFiguraActualDefecto());
                        sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(model.getFiguraActualDefecto());
                        break;    
                }
            }
            else if (etiqueta == "JComboBox"){
                switch (command){
                    case "figurasComboConfiComand":
                        comboBox = (JComboBox) ae.getSource();
                        switch (comboBox.getSelectedItem().toString()){
                            case "Linea":
                                model.setFiguraActualDefecto(Practica_Final_Model.FIGURA_LINEA);
                                model.setFiguraActual(model.getFiguraActualDefecto());
                                //sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(0);
                                break;
                            case "Circunferencia":
                                model.setFiguraActualDefecto(Practica_Final_Model.FIGURA_CIRCUNFERENCIA);
                                model.setFiguraActual(model.getFiguraActualDefecto());
                                //sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(1);
                                break;
                            case "Circulo":
                                model.setFiguraActualDefecto(Practica_Final_Model.FIGURA_CIRCULO);
                                model.setFiguraActual(model.getFiguraActualDefecto());
                                //sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(2);
                                break;
                        }
                        break;
                }
            }
            else if (etiqueta == "JMenu"){
                switch (command){
                    case "sketcherItem":
                        sketcherFrame.setVisible(true);
                        configurationFrame.setVisible(false);
                        model.setConfiguracionDefectoActivada(true);
                        break;
                    case "salirItem":
                        System.exit(0);
                        break;
                    case "trabajoItem":
                        JOptionPane.showMessageDialog(configurationFrame, informacion, "Informacion del trabajo", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
            }
        }   
    }
    
    /**
     * Clase empotrada, controlador del slider de la ventana de configuracion.
     */
    class ControllerChangeListenerConf implements ChangeListener{
        private JSlider slider;
        
        @Override
        public void stateChanged(ChangeEvent ce) {
            slider = (JSlider) ce.getSource();
            model.setGrosorDefecto(slider.getValue());
            configurationFrame.getIps().getEstado().setGrosor(model.getGrosorDefecto());
            model.setGrosor(model.getGrosorDefecto());
            sketcherFrame.getWestPanel().getDatosPanel().setrGrosor(model.getGrosor());
        }    
    }
    
    /**
     * Clase empotrada, contrlador de actions Listeners de la ventana sketcher.
     */
    class ControllerActionListenerSketcher implements ActionListener {

        private String etiquetaSket;
        private JRadioButton radioButton;
        private JButton button;
        private JComboBox comboBox;
        
        public ControllerActionListenerSketcher(String etiquetaSket) {
            this.etiquetaSket = etiquetaSket;
        }
        
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            
            if(etiquetaSket == "menuSket"){
                switch (command){
                case "configuracionItemSket":
                    sketcherFrame.setVisible(false);
                    configurationFrame.setVisible(true);
                    model.setConfiguracionDefectoActivada(false);
                    break;
                case "cargarImagenItemSket":
                    File fileLoad = lImage.getFile();
                    model.loadImagen(fileLoad);
                    sketcherFrame.getGraphicsPanel().repaint();
                    break;
                case "guardarImagenItemSket":
                    File fileSave = guardarImagen.getFile();
                    model.saveImagen(fileSave);
                    break;
                case "salirItemSket":
                    System.exit(0);
                    break;
                }
            }else if (etiquetaSket == "degradadosket"){
                switch(command){
                case "siDegradadoButtonsket":
                    radioButton = (JRadioButton) ae.getSource();
                    model.setDegradado(true);
                    sketcherFrame.getWestPanel().getDatosPanel().setDegradado(model.isDegradado());
                    sketcherFrame.getNorthPanel().getSelectPanel2().getC2().setVisible(true);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC2().setVisible(true);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC1().setVisible(true);
                    
                    break;
                case "noDegradadoButtonsket":
                    radioButton = (JRadioButton) ae.getSource();
                    model.setDegradado(false);
                    sketcherFrame.getWestPanel().getDatosPanel().setDegradado(model.isDegradado());
                    sketcherFrame.getNorthPanel().getSelectPanel2().getC2().setVisible(false);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC2().setVisible(false);
                    sketcherFrame.getWestPanel().getDatosPanel().getrC1().setVisible(true);
                    
                    break;
                }
            }else if (etiquetaSket == "Color 1: " )
                switch(command){
                    case "butonsSketCommand0":
                    case "butonsSketCommand1":
                    case "butonsSketCommand2":
                    case "butonsSketCommand3":
                    case "butonsSketCommand4":
                    case "butonsSketCommand5":
                    case "butonsSketCommand6":
                    case "butonsSketCommand7":
                    case "butonsSketCommand8":
                    case "butonsSketCommand9":
                    case "butonsSketCommand10":
                        button = (JButton) ae.getSource();
                        model.setC1(button.getBackground());
                        sketcherFrame.getWestPanel().getDatosPanel().setrC1(model.getC1());
                        model.setConfiguracionDefectoActivada(false);
                        break;
                }else if(etiquetaSket == "Color 2: "){
                    switch(command){
                    case "butonsSketCommand0":
                    case "butonsSketCommand1":
                    case "butonsSketCommand2":
                    case "butonsSketCommand3":
                    case "butonsSketCommand4":
                    case "butonsSketCommand5":
                    case "butonsSketCommand6":
                    case "butonsSketCommand7":
                    case "butonsSketCommand8":
                    case "butonsSketCommand9":
                    case "butonsSketCommand10":
                        button = (JButton) ae.getSource();
                        model.setC2(button.getBackground());
                        sketcherFrame.getWestPanel().getDatosPanel().setrC2(model.getC2());
                        model.setConfiguracionDefectoActivada(false);
                        break;
                    } 
                }else if (etiquetaSket == "northButtons"){
                    switch (command){
                        case "comboBoxFiguras":
                            comboBox = (JComboBox) ae.getSource();
                            switch (comboBox.getSelectedItem().toString()){
                                case "Linea":
                                    model.setFiguraActual(Practica_Final_Model.FIGURA_LINEA);
                                    break;
                                case "Circunferencia":
                                    model.setFiguraActual(Practica_Final_Model.FIGURA_CIRCUNFERENCIA);
                                    break;
                                case "Circulo":
                                    model.setFiguraActual(Practica_Final_Model.FIGURA_CIRCULO);
                                    break;
                            }
                            break;
                        case"configurationSketButton":
                            configurationFrame.setVisible(true);
                            sketcherFrame.setVisible(false);
                            model.setConfiguracionDefectoActivada(false);
                            model.setGrosor(model.getGrosorDefecto());
                            break;
                        case"cargarSketButton":  
                            File fileLoad = lImage.getFile();
                            model.loadImagen(fileLoad);
                            sketcherFrame.getGraphicsPanel().repaint();
                            break;
                        case"guardarSketButton":
                            File fileSave = guardarImagen.getFile();
                            model.saveImagen(fileSave);
                            break;
                        
                        case"nuevoSketButton":  
                            model.borrarImagen();
                            sketcherFrame.getGraphicsPanel().repaint();
                            
                            model.setNumLineas(0);
                            model.setNumCircunferencias(0);
                            model.setNumCirculo(0);
                            model.setDegradado(model.isDegradadoDefecto());
                            model.setC1(model.getC1Defecto());
                            model.setC2(model.getC2Defecto());
                            model.setGrosor(model.getGrosorDefecto());
                            
                            sketcherFrame.getWestPanel().getDatosPanel().setrNumLineas(model.getNumLineas());
                            sketcherFrame.getWestPanel().getDatosPanel().setrNumCirculo(model.getNumCirculo());
                            sketcherFrame.getWestPanel().getDatosPanel().setrNumCircunferencia(model.getNumCircunferencias());
                            sketcherFrame.getWestPanel().getDatosPanel().setDegradado(model.isDegradado());
                            sketcherFrame.getWestPanel().getDatosPanel().setrC1(model.getC1());
                            sketcherFrame.getWestPanel().getDatosPanel().setrC2(model.getC2());
                            sketcherFrame.getWestPanel().getDatosPanel().setrGrosor(model.getGrosor());
                            sketcherFrame.getSlider().getSlider().setValue(model.getGrosor());
                            break;
                        case"defectoSketButotn":
                            model.setDegradado(model.isDegradadoDefecto());
                            model.setC1(model.getC1Defecto());
                            model.setC2(model.getC2Defecto());
                            model.setGrosor(model.getGrosorDefecto());
                            model.setFiguraActual(model.getFiguraActualDefecto());
                            
                            if (model.isDegradado()){
                                sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getSi().setSelected(true);
                                sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getNo().setSelected(false);
                                
                                sketcherFrame.getNorthPanel().getSelectPanel2().getC1().setVisible(true);
                                sketcherFrame.getNorthPanel().getSelectPanel2().getC2().setVisible(true);
                                
                                sketcherFrame.getWestPanel().getDatosPanel().getrC1().setVisible(true);
                                sketcherFrame.getWestPanel().getDatosPanel().getrC2().setVisible(true);
                            }else{
                                sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getSi().setSelected(false);
                                sketcherFrame.getNorthPanel().getDegradadoPanel().getButtons().getNo().setSelected(true);
                                
                                sketcherFrame.getNorthPanel().getSelectPanel2().getC1().setVisible(true);
                                sketcherFrame.getNorthPanel().getSelectPanel2().getC2().setVisible(false);
                                
                                sketcherFrame.getWestPanel().getDatosPanel().getrC1().setVisible(true);
                                sketcherFrame.getWestPanel().getDatosPanel().getrC2().setVisible(false);
                            
                            }
                            
                            switch (model.getFiguraActual()){
                                case 0:
                                    model.setFiguraActual(Practica_Final_Model.FIGURA_LINEA);
                                    sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(0);
                                    break;
                                case 1:
                                    model.setFiguraActual(Practica_Final_Model.FIGURA_CIRCUNFERENCIA);
                                    sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(1);
                                    break;
                                case 2:
                                    model.setFiguraActual(Practica_Final_Model.FIGURA_CIRCULO);
                                    sketcherFrame.getNorthPanel().getButtons().getComboBox().setSelectedItem(2);
                                    break;
                            }
                            
                            sketcherFrame.getWestPanel().getDatosPanel().setDegradado(model.isDegradado());
                            sketcherFrame.getWestPanel().getDatosPanel().setrC1(model.getC1());
                            sketcherFrame.getWestPanel().getDatosPanel().setrC2(model.getC2());
                            sketcherFrame.getWestPanel().getDatosPanel().setrGrosor(model.getGrosor());
                            sketcherFrame.getSlider().getSlider().setValue(model.getGrosor());
                            break;
                    }
                }
            }
        }
    
    /**
     * Clase empotrada, controlador del slider de la ventana de sketcher.
     */
    class ControllerChangeListenerSket implements ChangeListener{
        private JSlider slider;
        
        @Override
        public void stateChanged(ChangeEvent ce) {
            slider = (JSlider) ce.getSource();
            model.setGrosor(slider.getValue());
            sketcherFrame.getWestPanel().getDatosPanel().setrGrosor(model.getGrosor());
            model.setConfiguracionDefectoActivada(false);
        }    
    }
    
    /**
     * Clase empotrada, controlador de las diferentes acciones que puede realizar el raton.
     */
    class ControllerMyMouseListener extends MouseAdapter{
        private int xi;
        private int yi;
        private int contador = 0;

        @Override
        public void mouseClicked(MouseEvent me) {
            
            // Boton izquierdo del raton (boton izquierdo), dibuja la figura seleccionada.
            if(me.getButton() == MouseEvent.BUTTON1){
                if(model.getFiguraActual() == Practica_Final_Model.FIGURA_LINEA) {
                if(contador == 0){
                    xi = me.getX();
                    yi = me.getY();
                    contador++;
                }else if (contador == 1){
                    if (model.isConfiguracionDefectoActivada()){
                        if(model.isDegradadoDefecto()){
                            model.pintarLineaDegradado(xi, yi, me.getX(), me.getY(), model.getGrosorDefecto(), model.getC1Defecto(), model.getC2Defecto());                        
                        }else{
                            model.pintarLinea(xi, yi, me.getX(), me.getY(), model.getGrosorDefecto(), model.getC1Defecto());
                        }
                    }else{
                        if(model.isDegradado()){
                            model.pintarLineaDegradado(xi, yi, me.getX(), me.getY(), model.getGrosor(), model.getC1(), model.getC2());                        
                        }else{
                            model.pintarLinea(xi, yi, me.getX(), me.getY(), model.getGrosor(), model.getC1());
                        }
                    }
                    contador = 0;
                    sketcherFrame.getWestPanel().getDatosPanel().setrNumLineas(model.getNumLineas());
                    sketcherFrame.getGraphicsPanel().repaint();
                }
            }else if (model.getFiguraActual() == Practica_Final_Model.FIGURA_CIRCULO){
                contador = 0;
                xi = me.getX();
                yi = me.getY();
                if (model.isConfiguracionDefectoActivada()){
                        if(model.isDegradadoDefecto()){
                            model.pintarCirculoDegradado(xi - (model.getGrosorDefecto()/2), yi - (model.getGrosorDefecto()/2), model.getGrosorDefecto(), model.getC1Defecto(), model.getC2Defecto());
                        }else{
                            model.pintarCirculo(xi - (model.getGrosorDefecto()/2), yi - (model.getGrosorDefecto()/2), model.getGrosorDefecto(), model.getC1Defecto());
                        }
                    }else{
                        if(model.isDegradado()){
                            model.pintarCirculoDegradado(xi - (model.getGrosor()/2), yi - (model.getGrosor()/2), model.getGrosor(), model.getC1(), model.getC2());
                        }else{
                            model.pintarCirculo(xi - (model.getGrosor()/2), yi - (model.getGrosor()/2), model.getGrosor(), model.getC1());
                        }
                    }
                sketcherFrame.getWestPanel().getDatosPanel().setrNumCirculo(model.getNumCirculo());
                sketcherFrame.getGraphicsPanel().repaint();
            }else if (model.getFiguraActual() == Practica_Final_Model.FIGURA_CIRCUNFERENCIA){
                contador = 0;
                xi = me.getX();
                yi = me.getY();
                if (model.isConfiguracionDefectoActivada()){
                        if(model.isDegradadoDefecto()){
                            model.pintarCircunferenciaDegradado(xi - (model.getGrosorDefecto()/2), yi - (model.getGrosorDefecto()/2), model.getGrosorDefecto(), model.getC1Defecto(), model.getC2Defecto());
                        }else{
                            model.pintarCircunferencia(xi - (model.getGrosorDefecto()/2), yi - (model.getGrosorDefecto()/2), model.getGrosorDefecto(), model.getC1Defecto());
                        }
                    }else{
                        if(model.isDegradado()){
                            model.pintarCircunferenciaDegradado(xi - (model.getGrosor()/2), yi - (model.getGrosor()/2), model.getGrosor(), model.getC1(), model.getC2());
                        }else{
                            model.pintarCircunferencia(xi - - (model.getGrosor()/2), yi - (model.getGrosor()/2), model.getGrosor(), model.getC1());
                        }
                    }
                sketcherFrame.getWestPanel().getDatosPanel().setrNumCircunferencia(model.getNumCircunferencias());
                sketcherFrame.getGraphicsPanel().repaint();
                } 
            }
            
            // Boton 3 del raton (boton derecho), aumenta el grosor/diametro en 5 unidades.
            if(me.getButton() == MouseEvent.BUTTON3){
                model.aumentarGrosor();
                sketcherFrame.getWestPanel().getDatosPanel().setrGrosor(model.getGrosor());
                sketcherFrame.getSlider().getSlider().setValue(model.getGrosor());
            }
            
        }        
    }
}
   