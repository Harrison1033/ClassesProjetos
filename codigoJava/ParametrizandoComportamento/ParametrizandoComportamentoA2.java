package teste;

import java.util.ArrayList;
import java.util.List;
//ParametrizandoComportamentoA2
public class MainUm {
    private static List<ClasseUm>cars = List.of(new ClasseUm("Green",2011),new ClasseUm("Black",1998),new ClasseUm("Red",2017));
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars,"Green"));
        System.out.println(filterCarByColor(cars,"Black"));
        System.out.println("_________________________");
        System.out.println(filterByYearBefore(cars,2015));

    }
    private static List<ClasseUm>filterGreenCar(List<ClasseUm>cars){
        List<ClasseUm>filteredCar = new ArrayList<>();//procura o carro pela cor verde
        for (ClasseUm car:cars ) {
            if (car.getColor().equals("Green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    } private static List<ClasseUm>filterRedCar(List<ClasseUm>cars){
        List<ClasseUm>filteredCar = new ArrayList<>();//procura o carro pela cor vermelha
        for (ClasseUm car:cars ) {
            if (car.getColor().equals("Red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    } private static List<ClasseUm>filterCarByColor(List<ClasseUm>cars,String cor){
        List<ClasseUm>filteredCar = new ArrayList<>();//procura o carro pela cor desejada
        for (ClasseUm car:cars ) {
            if (car.getColor().equals(cor)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
    private static List<ClasseUm>filterByYearBefore(List<ClasseUm>cars,int year){
        List<ClasseUm>filterCar = new ArrayList<>();//procura o carro pelo ano abaixo do ano digitado
        for (ClasseUm car: cars){
            if (car.getYear() < year){
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}