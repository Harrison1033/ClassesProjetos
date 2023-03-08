package teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//StreamFlatMapP1
public class MainUm {//Imprime listas aninhadas dentro de outras listas
    public static void main(String[] args) {
        List<List<String>>empresa = new ArrayList<>();
        List<String>graphicDesigners = List.of("Astoufo José","Catarina Santos","Sandy Hellen");
        List<String>developers = List.of("Harrison","Keliane","Nícolas");
        List<String>students = List.of("Micael","Joana","Sabrina");
        empresa.add(graphicDesigners);
        empresa.add(developers);
        empresa.add(students);

        for(List<String>people:empresa){//Forma antiga 
            for (String person : people){
                System.out.println(person);
            }
        }
        System.out.println("_________________________");
        empresa.stream().flatMap(Collection::stream).forEach(System.out::println);//forma do java8 acima
    }
}