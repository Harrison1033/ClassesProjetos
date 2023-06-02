package teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

//StreamFlatMapP2
public class MainUm {//Mostra as letras de todas as palavras (String)

    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));//Mostra as letras de uma só palavra

//        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
//        Stream<String> stream = Arrays.stream(letters);
        List<String> letters1 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters1);
    }
}