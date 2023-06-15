package estudando.classeMain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainClasse2 {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("print all list elements: ");
//        randomNumbers.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        randomNumbers.forEach(System.out::println);//esse código faz o mesmo que o código acima

        System.out.println("Take the first 5 numbers and put them in the set");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())//O set não aceita números repetidos
                .forEach(System.out::println);

        System.out.println("Turn the list of strings into a list of integers");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
   System.out.println("Even numbers greater than two: ");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Show the average of the numbers: ");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remove odd values: ");
        List<Integer>numAleatorioInteger = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numAleatorioInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numAleatorioInteger);
    }
}
