package teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
//NavigableMap,TreeMap
public class MainUm {
    public static void main(String[] args) {
        NavigableMap<String, String>map = new TreeMap<>();//Ordena pela chave
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");
        for (Map.Entry<String, String>entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println(map.headMap("C"));//imprime todos os resultados acima de C
        System.out.println(map.ceilingKey("C"));// >=
        System.out.println(map.higherKey("C"));// >
        System.out.println(map.lowerKey("C"));// <
        System.out.println(map.floorKey("C"));// <=
    }
}