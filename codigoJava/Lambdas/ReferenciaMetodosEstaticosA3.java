package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//ReferenciaMetodosEstaticosA3
public class MainUm {
    public static void main(String[] args) {
        List<ClasseUm>animeList = new ArrayList<>(List.of(new ClasseUm("Bersek",43),new ClasseUm("One Peace", 100),new ClasseUm("Naruto",500)));
        //Collections.sort(animeList,ClasseDois::compareByTitle); //Compara por título
        //Collections.sort(animeList,ClasseDois::compareByEpisodes); //Compara por episódio
        //animeList.sort(ClasseDois::compareByTitle); //Faz o mesmo que o código acima comparando por título
        animeList.sort(ClasseDois::compareByEpisodes); //Compara por episódio
        System.out.println(animeList);
    }
}