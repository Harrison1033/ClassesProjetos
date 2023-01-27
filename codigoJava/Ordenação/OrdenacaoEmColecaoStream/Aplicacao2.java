package estudando.classeMain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainClasse2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("imprima todos os elementos da lista: ");
//        numerosAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        numerosAleatorios.forEach(System.out::println);//esse código faz o mesmo que o código acima

        System.out.println("Pegue os 5 primeiros número e coloque no set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())//O set não aceita números repetidos
                .forEach(System.out::println);

        System.out.println("Transforme a lista de strings em uma lista de inteiros");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
   System.out.println("Numeros pares e maiores que dois: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostrar a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remove os valores ímpares: ");
        List<Integer>numAleatorioInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numAleatorioInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numAleatorioInteger);
    }
}
