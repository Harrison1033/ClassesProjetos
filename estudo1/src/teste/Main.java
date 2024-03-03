package teste;

import classes.Classe2;
import classes.Classe3;
import classes.Classe4;

public class Main {
    public static void main(String[] args) {
        Classe2 classe1 = new Classe2(23,"Alita Meyer",1.69,2339);
        Classe2 classe2 = new Classe2(19,"Alberto Roberto",1.78,2300);
        Classe3 classe3 = new Classe3();
        Classe4 classe4 = new Classe4();
        classe2.imprimir();
        System.out.println("---------------------------------------");
        classe1.imprimir();
        System.out.println("---------------------------------------");
        classe3.imprimir();
        classe4.setNome("Fredie Nendile");
        System.out.println(classe4.toString());
    }
}