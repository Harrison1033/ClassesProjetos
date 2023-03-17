package teste;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

//CollectorsSummarizing
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
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(ClasseQuatro::getPrice));
        System.out.println(collect);//mostra número de ítens, soma ,mínimo,média e máximo vlalor

        String titles = lightNovels.stream().map(ClasseQuatro::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);//Mostra todos os títulos separados por vírgula
    }
}
