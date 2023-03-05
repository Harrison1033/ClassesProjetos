package teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//StreamP2
public class MainUm {
    private static List<ClasseQuatro> lightNovels = new ArrayList<>(List.of(
            new ClasseQuatro("Tensei Shittara", 8.99),
            new ClasseQuatro("Over Lord", 3.99),
            new ClasseQuatro("Violet Evergarden", 5.99),
            new ClasseQuatro("No Game no Life", 2.99),
            new ClasseQuatro("Full Metal Alchimist", 5.99),
            new ClasseQuatro("Kumo Desuga", 1.99),
            new ClasseQuatro("Monogatori", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(ClasseQuatro::getTitle))//Ordena por Títulos
                .filter(ln -> ln.getPrice() <= 4)//Filtra por preço menor de 4
                .limit(3)//limita a 3 resultados
                .map(ClasseQuatro::getTitle)//Pego o título
                .collect(Collectors.toList());//Agrupa em uma lista
        System.out.println(titles);
    }
}