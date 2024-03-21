package one.digitalinovation.gof.service.impl;

import one.digitalinovation.gof.model.Cliente;
import one.digitalinovation.gof.model.ClienteRepository;
import one.digitalinovation.gof.model.Endereco;
import one.digitalinovation.gof.model.EnderecoRepository;
import one.digitalinovation.gof.service.ClienteService;
import one.digitalinovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring(via {@link org.springframework.beans.factory.annotation.Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Ingeta os componentes com o @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    //TODO Strategy: Implementar o métodos definidos na interface.
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples
    @Override
    public Iterable<Cliente> buscarTodos() {
        //FIXME Buscar todos os clientes
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //FIXME Buscar clitente po id
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }
        private void salvarClienteComCep(Cliente cliente){
        //FIXME Verifica se o endereço do cliente já existe (pelo cep).
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            //FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        //FIXME Inserir cliente, vinculando o Endereco(novo ou existente).
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //FIXME Buscar cliente por ID, caso exista.
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        //FIXME Verificar de o Endereco do Cliente já existe (pelo CEP).
        //FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        //FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
        if (clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        //FIXME Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }
}
