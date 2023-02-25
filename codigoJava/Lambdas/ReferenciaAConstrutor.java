package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//ReferenciaAConstrutor
public class MainUm {
    public static void main(String[] args) {
        Supplier <ClasseDois> newclasseDois = ClasseDois:: new;
        ClasseDois classeDois = newclasseDois.get();
        List<ClasseUm> animeList = new ArrayList<>(List.of(new ClasseUm("Bersek", 43), new ClasseUm("One Peace", 900),
                new ClasseUm("Naruto", 500)));

        animeList.sort(classeDois::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String,Integer,ClasseUm>animeBiFunction = (title, episodes) -> new ClasseUm(title,episodes);
        BiFunction<String,Integer,ClasseUm>animeBiFunction2 = ClasseUm::new;//Faz o mesmo que o código acima
        System.out.println(animeBiFunction.apply("Boruto",52));
        System.out.println(animeBiFunction2.apply("Dragon Ball",377));
    }
}