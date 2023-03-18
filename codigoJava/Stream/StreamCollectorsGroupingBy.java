package teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

//GroupingBy
// (Neste caso, agrupará por categoria)
public class MainUm {
    private static List<ClasseQuatro> lightNovels = new ArrayList<>(List.of(
            new ClasseQuatro("Tensei Shittara", 8.99,ClasseSete.FANTASY),
            new ClasseQuatro("Over Lord", 3.99,ClasseSete.FANTASY),
            new ClasseQuatro("Violet Evergarden", 5.99,ClasseSete.DRAMA),
            new ClasseQuatro("No Game no Life", 2.99,ClasseSete.FANTASY),
            new ClasseQuatro("Full Metal Alchimist", 5.99,ClasseSete.FANTASY),
            new ClasseQuatro("Kumos Desuga", 1.99,ClasseSete.FANTASY),
            new ClasseQuatro("Kumo Desuga", 1.99,ClasseSete.FANTASY),
            new ClasseQuatro("Monogatori", 4.00,ClasseSete.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<ClasseSete,List<ClasseQuatro>> collect = lightNovels.stream().collect(Collectors.groupingBy(ClasseQuatro::getCategory));
        System.out.println(collect);//Divide cada mangá por categoria

        Map<ClasseSete,Long>collect1 = lightNovels.stream().collect(Collectors.groupingBy(ClasseQuatro::getCategory,Collectors.counting()));
        System.out.println(collect1);//Faz a contagem por categoria

        Map<ClasseSete, ClasseQuatro>collect2 = lightNovels.stream().collect(Collectors.toMap(ClasseQuatro::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(ClasseQuatro::getPrice))));
        System.out.println(collect2);//Mostra o maior valor de cada categoria
    }
}