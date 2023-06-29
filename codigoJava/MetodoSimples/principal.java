package aleatorio.principais;

import aleatorio.classe.Amarelo;
import aleatorio.classe.Azul;
import aleatorio.classe.Cinza;
import aleatorio.classe.Verde;

public class Principal {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Animal cow = new Vaca();
        Animal cat = new Gato();
        falar (dog);
        falar(cow);
        falar(cat);
    }
    protected static void falar(Animal azul){
        dog.falar();

    }
}
