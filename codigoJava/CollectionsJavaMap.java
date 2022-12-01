package estudando.classeMain;

import java.util.*;

/**
 * Interface Map
  */
public class MainClasse {
    public static void main(String[] args) {
       //Crie um dicionário que relacione os modelos e seus respectivos consumos
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares);
        //Substitua o consumo do gol para 15,2 km/l
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);
        //Confira se o modelo tucson está no dicionário
        System.out.println(carrosPopulares.containsKey("tucson"));
        //Exibir o consumo do uno
        System.out.println(carrosPopulares.get("uno"));
        //Exiba os modelos
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        //Exiba o consumo dos carros
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        //Modelo mais econômico e seu consumo
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";
        for(Map.Entry<String,Double> entry: entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        //Modelo menos econômico e seu consumo
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = " ";
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente + " - "+ consumoMenosEficiente);
            }
        }
        //Exiba a soma dos consumos
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        //Exiba a média de consumo deste dicionário
        System.out.println(soma/carrosPopulares.size());
        //Remova os modelos como consumos iguais a 15,6 km/l
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6))iterator1.remove();
        }
        System.out.println(carrosPopulares);
        //Exiba todos os caqrros em ordem de inserção
        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares1);
        //Exiba o dicionário em ordem pelo modelo
        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares2);
        //Apague o dicionário de carros
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        //Confira se o dicionário está vazio
        System.out.println(carrosPopulares.isEmpty());

    }
}