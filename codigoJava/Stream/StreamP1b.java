package teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//StreamP1b
public class ClasseCinco {
    private static List<ClasseQuatro>lightNovels = new ArrayList<>(List.of(
            new ClasseQuatro("Tensei Shittara", 8.99),
            new ClasseQuatro("Over Lord", 3.99),
            new ClasseQuatro("Violet Evergarden", 5.99),
            new ClasseQuatro("No Game no Life", 2.99),
            new ClasseQuatro("Full Metal Alchimist", 5.99),
            new ClasseQuatro("Kumo Desuga", 1.99),
            new ClasseQuatro("Monogatori", 4.00)
    ));
    public static void main(String[] args) {
     lightNovels.sort(Comparator.comparing(ClasseQuatro::getTitle));

     List<String>titles = new ArrayList<>();
     for (ClasseQuatro lightNovel: lightNovels){
         if (lightNovel.getPrice() <= 4){
             titles.add(lightNovel.getTitle());
         }
         if (titles.size() >=3){
             break;
         }
     }
        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
