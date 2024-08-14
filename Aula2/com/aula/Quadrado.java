package com.aula;

public class Quadrado {
    double lado;

    Quadrado(double lado){
        this.lado = Math.max(lado,0);

    }

    double calcArea(){
        return lado*lado;

    }
    double calcPerimetro(){
        return lado*4;
    }
}
