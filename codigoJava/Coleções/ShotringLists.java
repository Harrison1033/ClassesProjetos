package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//ShotringLists
public class ClasseSeis {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);//Coloca na ordem de inserção
        mangas.add("Bleach");
        mangas.add("Pokemon");
        mangas.add("Hellsing");
        mangas.add("Bersek");
        mangas.add("Dragon Ball");
        Collections.sort(mangas);//Coloca em ordem alfabética no caso de String
        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
