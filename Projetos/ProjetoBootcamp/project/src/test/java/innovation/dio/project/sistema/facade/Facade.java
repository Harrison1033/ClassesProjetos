package innovation.dio.project.sistema.facade;

import innovation.dio.project.subsistemaCep.CepApi;
import innovation.dio.project.subsistemaCrm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
