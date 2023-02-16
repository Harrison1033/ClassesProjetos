package teste;

import java.util.ArrayList;
import java.util.List;

//ParametrizandoComportamentoB3
public class MainUm {
    private static List<ClasseUm> cars = List.of(new ClasseUm("green", 2011), new ClasseUm("black", 1998), new ClasseUm("red", 2017));

    public static void main(String[] args) {
//        List<ClasseUm> greenCars = filter(cars, new ClasseDois() {
//            @Override
//            public boolean test(ClasseUm car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<ClasseUm>redCars = filter(cars,car -> car.getColor().equals("red"));//Faz o mesmo que o bloco acima
        List<ClasseUm>yearBeforedCars = filter(cars,car -> car.getYear()<2015);//mostra os anos menores que 2015
        System.out.println(redCars);
        System.out.println(yearBeforedCars);
    }

    private static List<ClasseUm> filter(List<ClasseUm> cars, ClasseDois classeDois) {
        List<ClasseUm> filteredCar = new ArrayList<>();
        for (ClasseUm car : cars) {
            if (classeDois.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}