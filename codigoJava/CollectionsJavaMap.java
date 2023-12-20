package estudando.classeMain;
import java.util.*;
/**
 * Interface Map
  */
public class Main{
    public static void main(String[] args) {
       //Crie um dicionário que relacione os models e seus respectivos consumption
        Map<String,Double> popularCars = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(popularCars);
        //Substitua o consumo do gol para 15,2 km/l
        popularCars.put("gol",15.2);
        System.out.println(popularCars);
        //Confira se o modelo tucson está no dicionário
        System.out.println(popularCars.containsKey("tucson"));
        //Exibir o consumo do uno
        System.out.println(popularCars.get("uno"));
        //Exiba os models
        Set<String> models = popularCars.keySet();
        System.out.println(models);
        //Exiba o consumo dos carros
        Collection<Double> consumption = popularCars.values();
        System.out.println(consumption);
        //Modelo mais econômico e seu consumo
        Double moreEfficientConsumption = Collections.max(popularCars.values());
        Set<Map.Entry<String,Double>> entries = popularCars.entrySet();
        String mostEfficientModel = " ";
        for(Map.Entry<String,Double> entry: entries){
            if (entry.getValue().equals(moreEfficientConsumption)){
                mostEfficientModel = entry.getKey();
                System.out.println("Modelo mais Eficiente: " + mostEfficientModel + " - " + moreEfficientConsumption);
            }
        }
        //Modelo menos econômico e seu consumo
        Double lessEfficientConsumption = Collections.min(popularCars.values());
        String lessEfficientModel = " ";
        for (Map.Entry<String,Double> entry: popularCars.entrySet()){
            if (entry.getValue().equals(lessEfficientConsumption)){
                lessEfficientModel = entry.getKey();
                System.out.println("Modelo menos eficiente: "+ lessEfficientModel + " - "+ lessEfficientConsumption);
            }
        }
        //Exiba a sum dos consumption
        Iterator<Double> iterator = popularCars.values().iterator();
        Double sum = 0d;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println(sum);
        //Exiba a média de consumo deste dicionário
        System.out.println(sum/popularCars.size());
        //Remova os models como consumption iguais a 15,6 km/l
        Iterator<Double> iterator1 = popularCars.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6))iterator1.remove();
        }
        System.out.println(popularCars);
        //Exiba todos os caqrros em ordem de inserção
        Map<String,Double> popularCars1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(popularCars1);
        //Exiba o dicionário em ordem pelo modelo
        Map<String,Double> popularCars2 = new TreeMap<>(popularCars);
        System.out.println(popularCars2);
        //Apague o dicionário de carros
        popularCars.clear();
        System.out.println(popularCars);
        //Confira se o dicionário está vazio
        System.out.println(popularCars.isEmpty());

    }
}