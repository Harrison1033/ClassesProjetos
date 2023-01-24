package teste;

import java.util.HashMap;
import java.util.Map;

//Map,HashMap,LinkedHashMapP2
public class MainUm {
    public static void main(String[] args) {
        ClasseUm consumidor1 = new ClasseUm("Keliane de Lima");
        ClasseUm consumidor2 = new ClasseUm("Harrison de Oliveira");
        ClasseUm consumidor3 = new ClasseUm("Diego Gomes");

        ClasseDois manga1 = (new ClasseDois(5L, "Bleach     ", 19.95));
        ClasseDois manga2 = (new ClasseDois(1L, "Pokemon    ", 9.55));
        ClasseDois manga3 = (new ClasseDois(4L, "Hellsing   ", 3.22));
        ClasseDois manga4 = (new ClasseDois(3L, "Bersek     ", 11.25));
        ClasseDois manga5 = (new ClasseDois(2L, "Dragon Ball", 2.99));

        Map<ClasseUm,ClasseDois> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);
        consumidorManga.put(consumidor3,manga2);

        for (Map.Entry<ClasseUm,ClasseDois> entry: consumidorManga.entrySet()) {
            System.out.println(entry.getKey() + " _ " + entry.getValue());
//System.out.println(entry.getKey().getNome()+"_"+entry.getValue());//o getNome é só para ficar mais simples a impressão
        }
    }
}