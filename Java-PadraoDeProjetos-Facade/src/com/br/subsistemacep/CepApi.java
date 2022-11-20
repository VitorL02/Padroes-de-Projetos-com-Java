package com.br.subsistemacep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }
    public String recuperaEstado(String cep){
        return "Brasil";

    }

}
