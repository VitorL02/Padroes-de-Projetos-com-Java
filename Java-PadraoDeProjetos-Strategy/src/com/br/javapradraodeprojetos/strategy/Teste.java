package com.br.javapradraodeprojetos.strategy;
/*
* Padrao stategy permite a flexibilidade da classe, sendo que o robo respeita a interface comportamento
*
* */

public class Teste {
    public static void main(String[] args) {
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStategy(normal);
        robo.mover();
        robo.setStategy(agressivo);
        robo.mover();
    }
}
