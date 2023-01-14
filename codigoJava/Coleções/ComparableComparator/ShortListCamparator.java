package teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//ShortListCamparator
class MangaByIdComparator implements Comparator<ClasseUm> {

    @Override
    public int compare(ClasseUm manga1, ClasseUm manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class ClasseSeis {
    public static void main(String[] args) {
        List<ClasseUm> mangas = new ArrayList<>(6);
        mangas.add(new ClasseUm(5L, "Bleach     ", 19.95));
        mangas.add(new ClasseUm(1L, "Pokemon    ", 9.55));
        mangas.add(new ClasseUm(4L, "Hellsing   ", 3.22));
        mangas.add(new ClasseUm(3L, "Bersek     ", 11.25));
        mangas.add(new ClasseUm(2L, "Dragon Ball", 2.99));
        for (ClasseUm manga : mangas) {//Ordenado por inserção
            System.out.println(manga);
        }

        mangas.sort(new MangaByIdComparator());
        System.out.println("------------------------------------");
        for (ClasseUm manga : mangas) {//por ordem de id
            System.out.println(manga);
        }
    }
}
