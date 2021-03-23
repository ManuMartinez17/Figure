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
public class Triangulo extends Poligono implements IImpresion {

    @Override
    public void calcularArea() {
        calcularPerimetro();
        float semiperimetro = this.getPerimetro() / 2;
        float base = semiperimetro
                * (semiperimetro - this.getLados()[0])
                * (semiperimetro - this.getLados()[1])
                * (semiperimetro - this.getLados()[2]);

        float area = (float) Math.sqrt(base);
        this.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro = 0;
        for (int i = 0; i < this.getLados().length; i++) {
            perimetro += this.getLados()[i];
        }
        this.setPerimetro(perimetro);
    }

    @Override
    public void pedirDatosFigura() {
        Scanner reader = new Scanner(System.in);

        float[] ladosTriangulo = new float[3];
        for (int i = 0; i < ladosTriangulo.length; i++) {
            System.out.println("Ingrese lado " + (i + 1) + " del triangulo");
            ladosTriangulo[i] = reader.nextFloat();
        }
        this.setLados(ladosTriangulo);
    }

    @Override
    public void imprimirResultados() {
        System.out.println("Area del triangulo: " + this.getArea());
        System.out.println("Perimetro del triangulo: " + this.getPerimetro());
    }
}
