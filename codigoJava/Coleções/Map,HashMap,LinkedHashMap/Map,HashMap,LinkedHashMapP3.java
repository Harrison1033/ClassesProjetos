package teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Map,HashMap,LinkedHashMapP3
public class ClasseCinco {//Necessário as classes Manga e Consumidor
    public static void main(String[] args) {//Permite um consumidor comprar mais de um manga
        ClasseUm consumidor1 = new ClasseUm("Keliane de Lima");
        ClasseUm consumidor2 = new ClasseUm("Harrison de Oliveira");

        ClasseDois manga1 = (new ClasseDois(5L, "Bleach     ", 19.95));
        ClasseDois manga2 = (new ClasseDois(1L, "Pokemon    ", 9.55));
        ClasseDois manga3 = (new ClasseDois(4L, "Hellsing   ", 3.22));
        ClasseDois manga4 = (new ClasseDois(3L, "Bersek     ", 11.25));
        ClasseDois manga5 = (new ClasseDois(2L, "Dragon Ball", 2.99));

        List<ClasseDois>mangaConsumidor1List = List.of(manga1,manga2,manga3);
        List<ClasseDois>mangaConsumidor2List = List.of(manga4,manga5);

        Map<ClasseUm,List<ClasseDois>>consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2,mangaConsumidor2List);

        for (Map.Entry<ClasseUm,List<ClasseDois>>entry:consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            System.out.println(entry.getValue());
        }
    }
}
