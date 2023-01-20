package teste;

import java.util.HashSet;
import java.util.Set;

//Set_HashSet
public class ClasseDois {
    public static void main(String[] args) {
        Set<ClasseUm> mangas = new HashSet<>();//O set não permite elementos duplicados
        mangas.add(new ClasseUm(5L, "Bleach     ", 19.95,0));
        mangas.add(new ClasseUm(1L, "Pokemon    ", 9.55,5));
        mangas.add(new ClasseUm(4L, "Hellsing   ", 3.22,0));
        mangas.add(new ClasseUm(3L, "Bersek     ", 11.25,2));
        mangas.add(new ClasseUm(2L, "Dragon Ball", 2.99,0));
//Para manter a ordem de inserção usa-se o LinkedHashSet no lugar o HashSet
        for (ClasseUm manga:mangas) {
            System.out.println(manga);
        }
    }
}

