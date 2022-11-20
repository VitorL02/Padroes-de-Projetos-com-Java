package com.br.padraodeprojetosfacade;

import com.br.subsistemacep.CepApi;
import com.br.subsistemacrm.CrmService;


/*
* Cria uma forma mais simples de consumir diversos serviços de diferentes sistemas
*
*
* */
public class Facade {

    public void migrarCliente(String nome,String cep){
        //Utiliza a "api" de cep para recuperar os dados e logo passar pro crm como parametro
        String estado = CepApi.getInstance().recuperaEstado("cep");
        CrmService.gravarCliente(nome,cep,estado);
    }

    public static void main(String[] args) {
        Facade facadeIntance = new Facade();
        facadeIntance.migrarCliente("vitor","12341564261");
    }
}
