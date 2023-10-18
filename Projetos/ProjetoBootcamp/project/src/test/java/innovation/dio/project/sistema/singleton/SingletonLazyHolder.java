package innovation.dio.project.sistema.singleton;
/**
 * -Singleton "Lazy Holder".
 * -permite a criaçõa de uma instância
 * unica para ser reaproveitado (no caso
 * mostrará o endereço de memóris)
 * -@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {//Classe que encapsula a instancia abaixo;
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;//acessa a instancia pelo holder
    }
}
