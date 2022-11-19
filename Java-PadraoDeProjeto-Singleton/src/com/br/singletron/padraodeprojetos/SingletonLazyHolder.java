package com.br.singletron.padraodeprojetos;

/**
 * Singleton "que segura a instancia"
 *
 * @author Vitor
 */


public class SingletonLazyHolder {

    private static class InstanceHolder{
       public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
