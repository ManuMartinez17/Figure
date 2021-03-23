/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.logica;

import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class Circulo extends Figura implements IImpresion {

    private float radio;

    @Override
    public void calcularArea() {
        this.setArea((float) (Math.PI * radio * radio));
    }

    @Override
    public void calcularPerimetro() {
        this.setPerimetro((float) (2 * Math.PI * radio));
    }

    @Override
    public void pedirDatosFigura() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese radio del circulo");
        radio = reader.nextFloat();
    }

    @Override
    public void imprimirResultados() {
        System.out.println("Area del circulo: " + this.getArea());
        System.out.println("Perimetro del circulo: " + this.getPerimetro());
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

}
