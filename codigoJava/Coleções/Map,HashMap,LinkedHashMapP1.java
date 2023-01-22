package teste;

import java.util.HashMap;
import java.util.Map;

//Map,HashMap,LinkedHashMapP1
public class MainUm {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//Para manter a ordem de inserção usa-se o new LinkedHashMap<>();
        map.put("Teklado", "Teclado");//inserção com o map é pelo put
        map.put("Mouze", "Mouse");
        map.put("vc", "você");
        System.out.println(map);//Mostra resultados em uma unica linha
        for (String key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("-----------------------------");
        for (Map.Entry<String,String>entry: map.entrySet()) {//Faz o mesmo que o for acima
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}