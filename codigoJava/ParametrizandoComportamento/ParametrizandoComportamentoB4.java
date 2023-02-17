package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//ParametrizandoComportamentoB4
public class ClasseTres {
    private static List<ClasseUm> cars = List.of(new ClasseUm("green", 2011), new ClasseUm("black", 1998), new ClasseUm("red", 2017));

    public static void main(String[] args) {
        List<ClasseUm>blacCars = filter(cars,car -> car.getColor().equals("black"));
        List<ClasseUm>redCars = filter(cars,car -> car.getColor().equals("red"));
        List<ClasseUm>yearBeforedCars = filter(cars,car -> car.getYear()<2015);//mostra os anos menores que 2015
        System.out.println(blacCars);
        System.out.println(redCars);
        System.out.println(yearBeforedCars);
    }
    private static <T>List<T>filter(List<T>list, Predicate<T>predicate){
        List<T>filteredList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
