/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Final_Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author pablo
 */
public class Practica_Final_Model {
    
    
    public static final int FIGURA_LINEA = 0;
    public static final int FIGURA_CIRCUNFERENCIA = 1;
    public static final int FIGURA_CIRCULO = 2;
     
    private int figuraActual;
    private int figuraActualDefecto;
    
    private BufferedImage imagen;
    private String imagenFileName;
    private Graphics2D graphics;
    
    private Color c1Defecto;
    private Color c1;
    private Color c2Defecto;
    private Color c2;
    private int grosorDefecto; 
    private int grosor;
    private int numLineas;
    private int numCircunferencias;
    private int numCirculos;
    
    private boolean degradadoDefecto;
    private boolean degradado;
    private boolean configuracionDefectoActivada;
    
    /**
     * Constructor de la clase modelo.
     */
    public Practica_Final_Model() {
        
        this.c1Defecto = Color.BLACK;
        this.c2Defecto = Color.WHITE;
        this.grosorDefecto = 50;
        
        this.c1 = Color.BLACK;
        this.c2 = Color.WHITE;
        this.grosor = 50;
        
        this.numCirculos = 0;
        this.numCircunferencias = 0;
        this.numLineas = 0;
        
        this.imagen = new BufferedImage(1150,1000, BufferedImage.TYPE_INT_RGB); // Tamaño del panel de dibujo.
        
        this.configuracionDefectoActivada = true;
        this.degradadoDefecto = true;
        this.degradado = true;
        
        figuraActual = FIGURA_LINEA;
        
        graphics = (Graphics2D)imagen.createGraphics(); 
        graphics.setPaint(new Color(255, 255, 255)); // Pintar de color blanco el lienzo.
        graphics.fillRect(0, 0, 1150, 1000);
        this.imagenFileName = "Sin titulo";
        
        
    }
    
    // Metodos de la clase.
    
    /**
     *  Metodo set. Se encarga de cargar que figgura tenemos seleccionada.
     * @param figuraActual figura acutal.
     */
    public void setFiguraActual(int figuraActual) {
        switch(figuraActual){
            case FIGURA_LINEA:
            case FIGURA_CIRCUNFERENCIA:   
            case FIGURA_CIRCULO:
                this.figuraActual = figuraActual;
                break;
            default:
                
        }
    }
    
    /**
     * Metodo get. Metodo para acceder a la figuar por defecto.
     * @return figuraActualDefecto
     */
    public int getFiguraActualDefecto() {
        return figuraActualDefecto;
    }
    
    /**
     * Metodo set. Metodo para guardar la figura por defecto.
     * @param figuraActualDefecto figuraActualDefecto
     */
    public void setFiguraActualDefecto(int figuraActualDefecto) {
        this.figuraActualDefecto = figuraActualDefecto;
    }
    
    
    
    /**
     * Metodo get. 
     * @return Figura circulo.
     */
    public static int getFIGURA_CIRCULO() {
        return FIGURA_CIRCULO;
    }

    /**
     * Metodo get.
     * @return Figura circunferencia.
     */
    public static int getFIGURA_CIRCUNFERENCIA() {
        return FIGURA_CIRCUNFERENCIA;
    }
    
    /**
     * Metodo get.
     * @return Figura linea.
     */
    public static int getFIGURA_LINEA() {
        return FIGURA_LINEA;
    }
    
    /**
     * Metodo get.
     * @return Figura seleccionada
     */
    public int getFiguraActual() {
        return figuraActual;
    }
    
    /**
     * Metodo get. Nos indica si la configuracion por defecto esta activa o no.
     * @return ocnfiguracionDefectoActiva
     */
    public boolean isConfiguracionDefectoActivada() {
        return configuracionDefectoActivada;
    }
    
    /**
     * Metodo set. Guarda si esta la configuracion por defecto activa o no.
     * @param configuracionDefectoActivada configuracionDefectoActivada 
     */
    public void setConfiguracionDefectoActivada(boolean configuracionDefectoActivada) {
        this.configuracionDefectoActivada = configuracionDefectoActivada;
    }
    
    /**
     * Metodo get. Nos indica si hay degradado o no en la ventana Sketcher.
     * @return  degradado.
     */
    public boolean isDegradado() {
        return degradado;
    }
    
    /**
     * Metodo get. Nos indica si hay degradado o no en la ventana de Configuracion.
     * @return degradado defecto
     */
    public boolean isDegradadoDefecto() {
        return degradadoDefecto;
    }
    
    /**
     * Metodo set. Se encarga de guardar la informacion de si hay degradado o no en la ventana configuracion.
     * @param degradadoDefecto degradadoDefecto 
     */
    public void setDegradadoDefecto(boolean degradadoDefecto) {
        this.degradadoDefecto = degradadoDefecto;
    }
    
    /**
     * Metodo set. Se enccarga de guardar la informacion de si hay on no degradado en la ventana Sketcher.
     * @param desgradado  degradado 
     */
    public void setDegradado(boolean desgradado) {
        this.degradado = desgradado;
    }
    
    /**
     * Metodo get. Metodo para acceder al color 1.
     * @return c1
     */
    public Color getC1() {
        return c1;
    }
    
    /**
     * Metodo get. Metodo para acceder al color 1 por defecto.
     * @return c1Defecto
     */
    public Color getC1Defecto() {
        return c1Defecto;
    }

    /**
     * Metodo get. Metodo para acceder al color 2.
     * @return c2
     */
    public Color getC2() {
        return c2;
    }

    /**
     * Metodo get. Metodo para acceder al color 2 por defecto.
     * @return c2Defecto
     */
    public Color getC2Defecto() {
        return c2Defecto;
    }

    /**
     * Metodo get. Metodo para acceder al grosor.
     * @return grosor
     */
    public int getGrosor() {
        return grosor;
    }
    
    /**
     * Metodo get. Metodo para acceder al grosor por defecto.
     * @return grosorDefecto.
     */
    public int getGrosorDefecto() {
        return grosorDefecto;
    }
    
    /**
     * Metodo set. Metodo para guardar el valor del color 1.
     * @param c1 Color 1.
     */
    public void setC1(Color c1) {
        this.c1 = c1;
    }
    
    /**
     * Metodo set. Metodo para guardar el valor del color 1 por defecto.
     * @param c1Defecto Color 1 defecto.
     */
    public void setC1Defecto(Color c1Defecto) {
        this.c1Defecto = c1Defecto;
    }

    /**
     * Metodo set. Metodo para guardar el color 2.
     * @param c2  Color 2.
     */
    public void setC2(Color c2) {
        this.c2 = c2;
    }

    /**
     * Metodo set. Metodo para guardar el color 2 por defecto.
     * @param c2Defecto Color 2 defecto.
     */
    public void setC2Defecto(Color c2Defecto) {
        this.c2Defecto = c2Defecto;
    }

    /**
     * Metodo set. Metodo para guardar el grosor.
     * @param grosor  grosor
     */
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    /**
     * Metodo set. Metodo para guardar el grosor por defecto.
     * @param grosorDefecto grosorDefecto 
     */
    public void setGrosorDefecto(int grosorDefecto) {
        this.grosorDefecto = grosorDefecto;
    }

    /**
     * Metodo set. Metodo para guardar el nombre de la imagen. (no implementado).
     * @param imagenFileName imagenFileName 
     */
    public void setImagenFileName(String imagenFileName) {
        this.imagenFileName = imagenFileName;
    }
    
    /**
     * Metodo get. Metodo para acceder al nombre de la imagen.
     * @return imagenFileName
     */
    public String getImagenFileName() {
        return imagenFileName;
    }

    /**
     * Metodo get. Metodo para acceder al buffered de imagen. (No implementado). 
     * @return imagen.
     */
    public BufferedImage getImagen() {
        return imagen;
    }

    /**
     * Metodo set. Metodo para guardar en el buffer de imagen.
     * @param imagen imagen 
     */
    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    /**
     * Metodo set. Metodo para guardar el numero de circulos que hay pintados.
     * @param numCirculos numCirculos 
     */
    public void setNumCirculo(int numCirculos) {
        this.numCirculos = numCirculos;
    }

    /**
     * Metodo get. Metodo para acceder al numero de circulos que hay pintados.
     * @return numCirculos
     */
    public int getNumCirculo() {
        return numCirculos;
    }
    
    /**
     * Metodo get. Metodo para acceder al numero de circunferencias que hay pintadas.
     * @return numCircunferencias
     */
    public int getNumCircunferencias() {
        return numCircunferencias;
    }
    
    /**
     * Metodo set. Metodo para guardat el numero de circunferencias que hay pintadas.
     * @param numCircunferencias numCircunferencias 
     */
    public void setNumCircunferencias(int numCircunferencias) {
        this.numCircunferencias = numCircunferencias;
    }

    /**
     * Metodo get. Metodo para acceder al numero de lineas que hay pintadas.
     * @return numLineas
     */
    public int getNumLineas() {
        return numLineas;
    }
    
    /**
     * Metodo set. Metodo para guardar el numero de lineas que hay pintadas.
     * @param numLineas numLineas 
     */
    public void setNumLineas(int numLineas) {
        this.numLineas = numLineas;
    }
    
    
    /**
     * Funcion que pinta la linea con degradado 
     * @param xi Valor x inicial.
     * @param yi Valor y inicial.
     * @param xf Valor x final.
     * @param yf Valor y final.
     * @param grosor Valor grosor.
     * @param c1 Color 1.
     * @param c2 Color 2.
     */
    public void pintarLineaDegradado (int xi, int yi, int xf, int yf, int grosor, Color c1, Color c2){
        GradientPaint gradientPaint = new GradientPaint(xi, yi, c1, xf, yf, c2);
        
        graphics = (Graphics2D)imagen.getGraphics();
        graphics.setPaint(gradientPaint);
        graphics.setStroke(new BasicStroke(grosor));
        graphics.drawLine(xi, yi, xf, yf);
        numLineas++;
    }
    
    /**
     * Funcion que pinta la linea sin degradado
     * @param xi Valor x inicial.
     * @param yi Valor y inicial.
     * @param xf Valor x final.
     * @param yf Valor y final.
     * @param grosor Valor grosor.
     * @param c1 Valor color 1.
     */
    public void pintarLinea (int xi, int yi, int xf, int yf, int grosor, Color c1){
        graphics = (Graphics2D)imagen.getGraphics();
        graphics.setPaint(c1);
        graphics.setStroke(new BasicStroke(grosor));
        graphics.drawLine(xi, yi, xf, yf);
        numLineas++;
    }
    
    /**
     * Esta funcion limpiam el lienzo y lo deja en blanco.
     */
    public void  borrarImagen(){
        graphics = (Graphics2D)imagen.createGraphics(); 
        graphics.setPaint(new Color(255, 255, 255)); // Pintar de color blanco el lienzo.
        graphics.fillRect(0, 0, 1150, 1000);
        imagenFileName = "Sin titulo";
    }
    
    /**
     * Funcion que guarda la imagen.
     * @param imagenFile imagenFile
     */
   public void saveImagen(File imagenFile) {
        if (imagenFile != null) {
            try {
                this.imagenFileName = imagenFile.getName();
                ImageIO.write(imagen,"jpg",imagenFile);
            } 
            catch (IOException e) {
                System.out.println("Problemas guardando la imagen '" + imagenFile.getName() + "'.");
                System.out.println("Motivo: " + e.getLocalizedMessage());
            }
        }
    }
   
   /**
    *  Funcion que carga una imagen.
     * @param imagenFile imagenFile
    */
   public void loadImagen(File imagenFile) {
        if (imagenFile != null) {
            this.imagenFileName = imagenFile.getName();
            try {
                imagen = ImageIO.read(imagenFile);
            }
            catch (IOException e) {
                System.out.println("Problemas leyendo la imagen '" + this.imagenFileName + "'.");
                System.out.println("Motivo: " + e.getLocalizedMessage());
            }
        }
    }
   
    /**
     * 
     * Funcion que aumenta el grosor con el boton derecho. 
     * @return grosor grosor
     */
    public int aumentarGrosor(){
        
        grosor = grosor + 5;
        
        if (grosor > 100){
            grosor = grosor - 100;
        }
        
        return grosor;
    }
    
    /**
     * Funcion que borra la ultima linea que acaba de pintar
     */
    public void deshacer (){
        
    }
    
    /**
     * Funcion que pinta una circunferencia (rellena de color).
     * @param x Valor de la X.
     * @param y Valor de la Y.
     * @param color1 Color 1.
     * @param radio Valor del radio.
     */
    public void pintarCircunferencia(int x, int y, int radio, Color color1){
        Graphics2D gd= (Graphics2D) imagen.getGraphics();
        gd.setPaint(color1);
        gd.fillOval(x, y, radio, radio);
        numCircunferencias++;
    }
    
    /**
     * Funcion que pinta una circunferencia (rellena de color) con degradado. 
     * @param x Valor x.
     * @param y Valor Y.
     * @param color1 Color 1.
     * @param radio Valor del radio.
     * @param color2 Color 2.
     */
    public void pintarCircunferenciaDegradado(int x, int y , int radio, Color color1, Color color2){
        Graphics2D gd = (Graphics2D) imagen.getGraphics();
        GradientPaint gradientPaint = new GradientPaint(0, 0, color2, 175, 175, color1, true);
        gd.setPaint(gradientPaint);
        gd.fillOval(x, y, radio, radio);
        numCircunferencias++;
    }
    
    /**
     * Funcion que pinta un circulo (No tiene relleno).
     * @param x Valor de la x.
     * @param y Valor de la y.
     * @param radio Valor del radio.
     * @param color1 Valor del color 1.
     */
    public void pintarCirculo(int x, int y, int radio, Color color1){
        Graphics2D gd = (Graphics2D) imagen.getGraphics();
        gd.setPaint(color1);
        gd.drawOval(x, y, radio, radio);
        numCirculos++;
    }
    
    /**
     *  Funcio que pinta un circulo (no tiene relleno) con degradado.
     * @param x Valor de la x.
     * @param y Valor de la y.
     * @param color2 Color 2.
     * @param radio Valor del radio.
     * @param color1 Color 1.
     */
    public void pintarCirculoDegradado (int x, int y , int radio, Color color1, Color color2){
        Graphics2D gd = (Graphics2D) imagen.getGraphics();
        GradientPaint gradientPaint = new GradientPaint(0, 0, color2, 175, 175, color1);
        gd.setPaint(gradientPaint);
        gd.drawOval(x, y, radio, radio);
        numCirculos++;
    }   
}
