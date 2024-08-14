package com.aula;

public class Revolver {
    int qtMunicao , qtMaxima;


    Revolver(int qtMaxima, int qtMunicao){
        this.qtMaxima = qtMaxima;
        this.qtMunicao = qtMunicao;

    }
    void atirar(){
        if(qtMunicao > 0){
            qtMunicao --;
            System.out.println("POW");
        }
    }
     void recarregar(){
        if(qtMunicao < qtMaxima){
            qtMunicao ++;
        }
    }
    void mostrar(){
        System.out.println(qtMunicao);
    }
    
}
