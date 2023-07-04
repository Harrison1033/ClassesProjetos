package teste;

import java.util.List;

//WildcardList
public class ClasseUm {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printConsulta(dogs);
        printConsulta(cats);
    }

    private static void printConsulta(List<? extends Animal> animals) {//Para leitura(Não permite adicionar)
        for (Animal animal : animals) {
            animal.consult();
        }
    }
}

