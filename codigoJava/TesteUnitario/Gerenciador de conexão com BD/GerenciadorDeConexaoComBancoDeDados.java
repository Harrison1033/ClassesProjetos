import java.util.logging.Logger;

/**
 * "Hipotético" exemplo de uma classe que conecta com banco de dados. <br />
 *
 * <b>DISCLAIMER</b>: <i>Não é um exemplo real/atual desse cenário, serve apenas como exemplo para os testes com JUnit</i>
 */
public class GerenciadorDeConexaoComBancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no DB
        LOGGER.info("removeu dados");
    }
}