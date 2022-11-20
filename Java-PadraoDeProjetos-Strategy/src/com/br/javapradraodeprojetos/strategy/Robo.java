package com.br.javapradraodeprojetos.strategy;

public class Robo {
    private Comportamento stategy;

    //Esse metodo permite o robo a mudar sua estrategia
    public void setStategy(Comportamento stategy) {
        this.stategy = stategy;
    }

    public void mover(){
        stategy.mover();
    }
}
