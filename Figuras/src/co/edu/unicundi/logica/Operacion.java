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
public class Operacion {

    public void operar() {
        int opcion = 0;
        
        while (opcion != 4) {
            opcion = seleccionarFigura();
            switch (opcion) {
                case 1:
                    Circulo circulo = new Circulo();
                    circulo.pedirDatosFigura();
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    circulo.imprimirResultados();
                    break;
                case 2:
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.pedirDatosFigura();
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();
                    cuadrado.imprimirResultados();
                    break;
                case 3:
                    Triangulo triangulo = new Triangulo();
                    triangulo.pedirDatosFigura();
                    triangulo.calcularArea();
                    triangulo.calcularPerimetro();
                    triangulo.imprimirResultados();
                    break;
                default:
                    break;
            }
        }
    }
    
    private int seleccionarFigura() {
        Scanner reader = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("Seleccione la figura que desea operar");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Salir");
        System.out.println("-------------------------------------");

        int opcion = reader.nextInt();

        return opcion;
    }
}
