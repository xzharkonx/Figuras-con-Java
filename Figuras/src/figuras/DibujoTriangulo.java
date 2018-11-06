/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class DibujoTriangulo extends JPanel{
    private int base, altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
     @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        
        //Dibujar
        Poligono pi = new Poligono();
        int[] cosx ={50,50+this.base,50};
        int[] cosy ={10+this.altura,10+this.altura,10};
        pi.setCoordX(cosx);
        pi.setCoordY(cosy);
        pi.setNpuntos(3);
        g.setColor(Color.red);
//        g.drawPolygon(pi.PrepararPoligono());
        g.fillPolygon(pi.PrepararPoligono());
        
//        g.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
//g.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
    }
}
