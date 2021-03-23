/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.logica;

/**
 *
 * @author Tania
 */
public abstract class Figura implements IFigura {
    
    private float area;
    private float perimetro;

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public float getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
}
