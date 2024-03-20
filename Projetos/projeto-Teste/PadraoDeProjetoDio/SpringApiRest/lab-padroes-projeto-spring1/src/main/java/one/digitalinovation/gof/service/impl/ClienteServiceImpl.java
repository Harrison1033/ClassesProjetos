package one.digitalinovation.gof.service.impl;

import one.digitalinovation.gof.model.Cliente;
import one.digitalinovation.gof.service.ClienteService;
import org.springframework.stereotype.Service;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring(via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Ingeta os componentes com o @Autowired.
    //TODO Strategy: Implementar o métodos definidos na interface.
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
