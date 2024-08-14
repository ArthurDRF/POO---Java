package com.aula;

public class Main{
    public static void main(String[] args){
    Contador c = new Contador();
    c.incrementar();
    c.mostrar();


    // EXERCICIO 1
    Revolver r = new Revolver(6, 2);
    
    r.recarregar();
    r.recarregar();
    r.recarregar();
    r.recarregar();
    r.recarregar();
    r.recarregar();
    r.recarregar();
    r.atirar();
    r.atirar();
    r.mostrar();
    
    // EXERCICIO 2
    Quadrado q = new Quadrado(-5);
    // Quando tem return precisa do System.out.printIn
    System.out.println("Area: " + q.calcArea());
    System.out.println("Perimetro: " + q.calcPerimetro());
    }
}