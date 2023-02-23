package teste;

import java.util.ArrayList;
import java.util.List;
//ReferenciaMetodosNaoEstaticosB1
public class MainUm1 {
    public static void main(String[] args) {
        ClasseDois classeDois = new ClasseDois();
        List<ClasseUm> animeList = new ArrayList<>(List.of(new ClasseUm("Bersek", 43), new ClasseUm("One Peace", 900),
                new ClasseUm("Naruto", 500)));

        animeList.sort(classeDois::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}