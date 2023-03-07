package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//StreamP3
public class ClasseSete {
    private static List<ClasseQuatro> lightNovels = new ArrayList<>(List.of(
            new ClasseQuatro("Tensei Shittara", 8.99),
            new ClasseQuatro("Over Lord", 3.99),
            new ClasseQuatro("Violet Evergarden", 5.99),
            new ClasseQuatro("No Game no Life", 2.99),
            new ClasseQuatro("Full Metal Alchimist", 5.99),
            new ClasseQuatro("Kumo Desuga", 1.99),
            new ClasseQuatro("Kumo Desuga", 1.99),
            new ClasseQuatro("Monogatori", 4.00)
    ));

    public static void main(String[] args) {
        Stream<ClasseQuatro> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);//imprime na ordem de inserção

        long count = stream.distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);//Conta quantos valores distintos menores de 4
    }
}