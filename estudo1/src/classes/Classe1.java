package classes;

import java.util.ArrayList;
import java.util.List;

//Exemplo de list que imprime o primeiro resultado utilizando o lambda

public class Classe1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Laranja");
        lista.add("Limão");
        lista.add("Banana");
        lista.add("Acerola");

        lista.stream().findFirst().ifPresent(System.out::println);
        System.out.println(lista);
    }
}

