package teste;
//WildcardArray
abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {
    @Override
    public void consult() {
        System.out.println("Consult Dog: ");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("Consult Cat: ");
    }
}

public class MainUm {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsulta(dogs);
        printConsulta(cats);
    }
    private static void printConsult(Animal[]animals){
        for (Animal animal : animals) {
            animal.consult();
        }

    }
}