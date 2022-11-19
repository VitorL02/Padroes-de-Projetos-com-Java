package com.br.singletron.padraodeprojetos;


/**
 * Singleton "preguiçoso"
 * singleton realiza sua propria instancia
 * @author Vitor
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
