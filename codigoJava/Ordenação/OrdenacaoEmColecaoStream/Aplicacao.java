package estudando.classe1;

import java.util.*;
public class QuartaClasse {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, TerceiraClasse> agenda = new HashMap<>() {{
            put(1, new TerceiraClasse("Simba", 5555));
            put(4, new TerceiraClasse("Cami", 1111));
            put(3, new TerceiraClasse("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, TerceiraClasse> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
		//Classe anônima
//        Set<Map.Entry<Integer, TerceiraClasse>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, TerceiraClasse>>() {
//            @Override
//            public int compare(Map.Entry<Integer, TerceiraClasse> cont1, Map.Entry<Integer, TerceiraClasse> cont2) {
//                return Integer.compare(cont1.getValue().getNumero(),cont2.getValue().getNumero());
//            }
//        });
//        set.addAll(agenda.entrySet());
//        for (Map.Entry<Integer, TerceiraClasse> entry: set) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
//                    ": " +entry.getValue().getNome());
//        }
        //------------------------------------------------------------------------------------------------------------
        //Comparator
//        Set<Map.Entry<Integer, TerceiraClasse>> set = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, TerceiraClasse>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, TerceiraClasse> cont) {
//                        return cont.getValue().getNumero();
//                    }
//                }));
//
//        set.addAll(agenda.entrySet());
//        for (Map.Entry<Integer, TerceiraClasse> entry: set) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
//                    ": " +entry.getValue().getNome());
//        }
        //------------------------------------------------------------------------------------------------------------
        //Lambda
        Set<Map.Entry<Integer, TerceiraClasse>> set = new TreeSet<Map.Entry<Integer, TerceiraClasse>>(
                Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, TerceiraClasse> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }