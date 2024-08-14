package com.aula;

public class Contador{
    int qtContador;

    void incrementar(){
        qtContador ++;
    }

    void decrementar(){
        if(qtContador > 0){
            qtContador --;
        }
    }

    void zerar(){
        qtContador = 0;
    }

    void mostrar(){
        System.out.println(qtContador);
    }

}