package com.br.javapradraodeprojetos.strategy;

public class ComportamentoAgressivo implements  Comportamento{
    @Override
    public void mover() {
        System.out.println("Comportamento Agressivo ");
    }
}
