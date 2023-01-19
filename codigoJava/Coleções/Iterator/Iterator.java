package teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Iterator
public class ClasseCinco {
    public static void main(String[] args) {
        List<ClasseUm> mangas = new ArrayList<>(6);
        mangas.add(new ClasseUm(5L, "Bleach     ", 19.95,0));
        mangas.add(new ClasseUm(1L, "Pokemon    ", 9.55,5));
        mangas.add(new ClasseUm(4L, "Hellsing   ", 3.22,0));
        mangas.add(new ClasseUm(3L, "Bersek     ", 11.25,2));
        mangas.add(new ClasseUm(2L, "Dragon Ball", 2.99,0));
        //Elimina todos os mangas de quantidade 0 usando o Iterator, usado principalmente antes do java 8
        Iterator<ClasseUm> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            if (mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
        //Faz o mesmo que o código acima, porém só apartir do java 8
        mangas.removeIf(manga -> manga.getQuantidade()==0);
        System.out.println(mangas);
    }
}
