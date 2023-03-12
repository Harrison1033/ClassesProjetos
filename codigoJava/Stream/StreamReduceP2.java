package teste;

import java.util.ArrayList;
import java.util.List;
//ReduceP2
public class ClasseUm {
    private static List<ClasseQuatro> lightNovels = new ArrayList<>(List.of(
            new ClasseQuatro("Tensei Shittara", 8.99),
            new ClasseQuatro("Over Lord", 3.99),
            new ClasseQuatro("Violet Evergarden", 5.99),
            new ClasseQuatro("No Game no Life", 2.99),
            new ClasseQuatro("Full Metal Alchimist", 5.99),
            new ClasseQuatro("Kumos Desuga", 1.99),
            new ClasseQuatro("Kumo Desuga", 1.99),
            new ClasseQuatro("Monogatori", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(ClasseQuatro::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()//Faz o mesmo que o códico acima, porém com maior performance
                .mapToDouble(ClasseQuatro::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);

    }
}
