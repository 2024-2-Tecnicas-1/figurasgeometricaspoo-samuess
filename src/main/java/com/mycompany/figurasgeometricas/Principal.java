package com.mycompany.figurasgeometricas;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombreFigura;
        String colorFigura;
        int tipoFigura;

        System.out.println("Ingrese el nombre de la figura:");
        nombreFigura = lector.nextLine();
        System.out.println("Ingrese el color de la figura:");
        colorFigura = lector.nextLine();
        System.out.println("Ingrese el tipo de figura en número (1. Circulo, 2. Rectangulo, 3. Triangulo)");
        tipoFigura = lector.nextInt();

        switch(tipoFigura){
            case 1:
                double radio;
                System.out.println("Ingrese el valor del círculo:");
                radio = lector.nextDouble();
                Circulo circulo = new Circulo(nombreFigura, colorFigura, radio);
                System.out.println("El círculo '" + circulo.getNombreFigura() + "' es de color " + circulo.getColorFigura());
                System.out.println("Su área es: " + circulo.obtenerArea());
                System.out.println("Su perímetro es: " + circulo.obtenerPerimetro());
                break;
            case 2:
                double lado1, lado2;
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                lado2 = lector.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombreFigura, colorFigura, lado1, lado2);
                System.out.println("El rectángulo '" + rectangulo.getNombreFigura() + "' es de color " + rectangulo.getColorFigura());
                System.out.println("Su área es: " + rectangulo.obtenerArea());
                System.out.println("Su perímetro es: " + rectangulo.obtenerPerimetro());
                break;
            case 3:
                double base, altura;
                System.out.println("Ingrese el valor de la base del triángulo:");
                base = lector.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                altura = lector.nextDouble();
                Triangulo triangulo = new Triangulo(nombreFigura, colorFigura, base, altura);
                System.out.println("El triángulo '" + triangulo.getNombreFigura() + "' es de color " + triangulo.getColorFigura());
                System.out.println("Su área es: " + triangulo.obtenerArea());
                System.out.println("Su perímetro es: " + triangulo.obtenerPerimetro());
                break;
            default:
                System.out.println("Ingrese un digito valido. (1. Círculo, 2. Rectángulo, 3. Triángulo)");
        }

    }
}