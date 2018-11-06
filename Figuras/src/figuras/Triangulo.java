/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Triangulo extends JPanel{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
       
    public double area(){
      double area = ((this.base * this.altura)/2);
      return area;
    }
    
     @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        
        //Dibujar
        Poligono pi = new Poligono();
        int[] cosx ={50,50+(int)this.base,50};      
        int[] cosy ={50+(int)this.altura,50+(int)this.altura,50};
        pi.setCoordX(cosx);
        pi.setCoordY(cosy);
        pi.setNpuntos(3);
        g.setColor(Color.red);
//        g.drawPolygon(pi.PrepararPoligono



        g.fillPolygon(pi.PrepararPoligono());
        
        
        
//        g.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
//g.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
    }
}
