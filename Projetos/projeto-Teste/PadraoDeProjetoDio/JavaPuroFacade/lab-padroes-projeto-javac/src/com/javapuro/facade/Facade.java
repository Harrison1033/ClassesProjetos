package com.javapuro.facade;

import com.javapuro.facade.subsistema1.crm.CrmService;
import com.javapuro.facade.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
