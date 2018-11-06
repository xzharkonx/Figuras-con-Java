/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Polygon;

/**
 *
 * @author Eduardo
 */

public class Poligono {
    private int npuntos;
    private int[] coordX;
    private int[] coordY;
    
    public Polygon PrepararPoligono(){
return new Polygon(this.getCoordX(),this.getCoordY(),this.getNpuntos());
}
    
    public Poligono(){
        
    }

    public Poligono(int npuntos, int[] coordX, int[] coordY) {
        this.npuntos = npuntos;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getNpuntos() {
        return npuntos;
    }

    public void setNpuntos(int npuntos) {
        this.npuntos = npuntos;
    }

    public int[] getCoordX() {
        return coordX;
    }

    public void setCoordX(int[] coordX) {
        this.coordX = coordX;
    }

    public int[] getCoordY() {
        return coordY;
    }

    public void setCoordY(int[] coordY) {
        this.coordY = coordY;
    }
    
    
}
