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
public abstract class Poligono extends Figura {
    
    private float[] lados;
    
    /**
     * @return the lados
     */
    public float[] getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(float[] lados) {
        this.lados = lados;
    }
}
