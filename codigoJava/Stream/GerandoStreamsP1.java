package teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//GerandoStreamsP1
public class ClasseSete {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 25).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));//números pares de 1 a 50
        System.out.println();

        Stream.of("Uma", "Frase", "Qualquer")//No caso esse stream é de strings
                .map(String::toUpperCase)//Todas a letras em maiúsculas
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num).average().ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\aguia\\Desktop\\arquivo.txt"))) {
            lines.forEach(System.out::println); //Imprime todas as frases do arquivo.txt
            System.out.println("------------------------------------");
            //lines.filter(l -> l.contains("java")).forEach(System.out::println);//Só imprime frases que contenham "java"
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}