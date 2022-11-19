package com.br.singletron.padraodeprojetos;

/**
 * Singleton "apressado"
 * ele não verifica se a instancia e nula, o mesmo atribui a instancia o mais rapido possivel
 * @author Vitor
 */


public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
