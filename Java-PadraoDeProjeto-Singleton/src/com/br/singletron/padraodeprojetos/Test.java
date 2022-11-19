package com.br.singletron.padraodeprojetos;

public class Test {

    public static void main(String[] args) {
        //Testes Relacionados ao singleton 
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager  = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder  = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);

    }
}
