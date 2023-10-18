package innovation.dio.project.sistema.singleton;
/**
 * -Singleton "apressado".
 * -permite a criaçõa de uma instância
 * unica para ser reaproveitado (no caso
 * mostrará o endereço de memóris)
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
