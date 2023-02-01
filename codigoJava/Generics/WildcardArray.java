package teste;
//WildcardArray
abstract class Animal {
    public abstract void consultar();
}

class Cachorro extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultar Cachorro: ");
    }
}

class Gato extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultar Gato: ");
    }
}

public class MainUm {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
    }
    private static void printConsulta(Animal[]animals){
        for (Animal animal : animals) {
            animal.consultar();
        }

    }
}