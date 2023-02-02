package teste;

import java.util.List;

//WildcardList
public class ClasseUm {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    private static void printConsulta(List<? extends Animal> animals) {//Para leitura(Não permite adicionar)
        for (Animal animal : animals) {
            animal.consultar();
        }
    }
}

