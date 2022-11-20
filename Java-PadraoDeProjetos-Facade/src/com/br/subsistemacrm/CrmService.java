package com.br.subsistemacrm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado){
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
    }
}
