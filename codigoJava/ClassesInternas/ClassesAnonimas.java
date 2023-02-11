package teste;
//ClassesAnonimas
class Animal {
    public void walk() {
        System.out.println("Animal Walking");
    }
}

public class MainUm {
    public static void main(String[] args) {
        Animal animal = new Animal() {//Classe que não pode ser reutilizada
            @Override//Classe anônima
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}