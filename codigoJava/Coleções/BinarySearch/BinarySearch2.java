package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//BinarySearch2
public class ClasseCinco {
    public static void main(String[] args) {
       // ClasseUmByIdComparator classeUmByIDComparator = new ClasseUmByIdComparator();
        List<ClasseUm> mangas = new ArrayList<>(6);
        mangas.add(new ClasseUm(5L, "Bleach     ", 19.95));
        mangas.add(new ClasseUm(1L, "Pokemon    ", 9.55));
        mangas.add(new ClasseUm(4L, "Hellsing   ", 3.22));
        mangas.add(new ClasseUm(3L, "Bersek     ", 11.25));
        mangas.add(new ClasseUm(2L, "Dragon Ball", 2.99));
//        Collections.sort(mangaByIdComparator);//por id
        mangas.sort(ClasseUm::compareTo);//por nome
        for (ClasseUm manga : mangas) {//Ordenado por inserção
            System.out.println(manga);
        }
        ClasseUm mangaToSearch = new ClasseUm(3L,"Bersek     ",11.25);//neste caso o espaço conta
        System.out.println(Collections.binarySearch(mangas,mangaToSearch));//Mostra a posiçõa pós ordenação
    }

}
