package teste;
//modify04
import classes.Classe1;
import classes.Classe2;
import classes.Classe3;
import classes.Classe4;

public class Main {
    public static void main(String[] args) {
        Classe1 cliente1 = new Classe1("Alberto",Classe4.PESSOA_FISICA,Classe3.CREDITO);
        Classe1 cliente2 = new Classe1("Jumbo",Classe4.PESSOA_JURIDICA,Classe3.DEBITO);
        Classe1 cliente3 = new Classe1("Emília",Classe4.PESSOA_FISICA,Classe3.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}