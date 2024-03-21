package one.digitalinovation.gof.service.impl;

import one.digitalinovation.gof.model.Cliente;
import one.digitalinovation.gof.service.ClienteService;
import org.springframework.stereotype.Service;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring(via {@link org.springframework.beans.factory.annotation.Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Ingeta os componentes com o @Autowired.
    //TODO Strategy: Implementar o métodos definidos na interface.
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples
    @Override
    public Iterable<Cliente> buscarTodos() {
        //FIXME Buscar todos os clientes
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //FIXME Buscar clitente po id
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
        //FIXME Verifica se o endereço do cliente já existe (pelo cep).
        //FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        //FIXME Inserir cliente, vinculando o Endereco(novo ou existente).
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //FIXME Buscar cliente por ID, caso exista.
        //FIXME Verificar de o Endereco do Cliente já existe (pelo CEP).
        //FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        //FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
    }

    @Override
    public void deletar(Long id) {
        //FIXME Deletar Cliente por ID.
    }
}
