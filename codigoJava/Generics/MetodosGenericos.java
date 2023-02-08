package teste;

import java.util.List;

//Métodos Genéricos
public class ClasseQuatro {
    public static void main(String[] args) {
        List<Carro> carroList = criandoArryComObjeto(new Carro("fusca"));
        System.out.println(carroList);
    }

    private static <T> List<T> criandoArryComObjeto(T t) {
        return List.of(t);
    }
    public static class Carro {
        private final String nome;

        public Carro(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Carro{" + "nome='" + nome + '\'' + '}';
        }
    }
}
