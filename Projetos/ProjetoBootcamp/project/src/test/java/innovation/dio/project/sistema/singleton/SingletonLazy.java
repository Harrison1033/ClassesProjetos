package innovation.dio.project.sistema.singleton;
/**
 * Singleton "preguiçoso".
 * -permite a criaçõa de uma instância
 * unica para ser reaproveitado (no caso
 * mostrará o endereço de memóris)
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
