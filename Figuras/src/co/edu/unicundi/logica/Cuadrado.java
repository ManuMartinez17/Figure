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
public class Cuadrado extends Poligono implements IImpresion {

    @Override
    public void calcularArea() {
        this.setArea(this.getLados()[0] * this.getLados()[1]);
    }

    @Override
    public void calcularPerimetro() {
        this.setPerimetro(this.getLados()[0] * 4);
    }

    @Override
    public void pedirDatosFigura() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese lado del cuadrado");
        float lado = reader.nextFloat();
        float[] ladosCuadrado = new float[4];
        for (int i = 0; i < ladosCuadrado.length; i++) {
            ladosCuadrado[i] = lado;
        }
        this.setLados(ladosCuadrado);
    }

    @Override
    public void imprimirResultados() {
        System.out.println("Area del cuadrado: " + this.getArea());
        System.out.println("Perimetro del cuadrado: " + this.getPerimetro());
    }
}
