package com.mycompany.figurasgeometricas;

class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura){
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double obtenerArea(){
        return (base * altura)/2;
    }

    public double obtenerPerimetro(){
        return (base * altura)/2;
    }

}
