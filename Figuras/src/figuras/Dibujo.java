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
public class Dibujo extends JPanel{

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        //Dibujar
        Poligono pi = new Poligono();
        int[] cosx ={150,220,220,150};
        int[] cosy ={300,300,200,200};
        pi.setCoordX(cosx);
        pi.setCoordY(cosy);
        pi.setNpuntos(4);
        g.setColor(Color.red);
//        g.drawPolygon(pi.PrepararPoligono());
        g.fillPolygon(pi.PrepararPoligono());
//        g.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
//g.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
    }
}
