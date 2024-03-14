package teste;
//momodify07
/**
 * Programa Destinado para rever temas já aprendidos
 * em cada classe terá uma descrição do que ela represnta
 * toda vez que o programa mudar, as descrições também devem mudar
 * por enquanto, eles estarão disponíveis no meu github para testar meu conhecimento git
 * ao final, espero está preparado para um projeto bem complexo
 */

import classes.Classe1;
import classes.Classe2;
import classes.Classe3;
import classes.Classe4;

public class Main {
    public static void main(String[] args) {
        Classe1 cliente1 = new Classe1("Alberto", Classe4.PESSOA_FISICA, Classe3.CREDITO);
        Classe1 cliente2 = new Classe1("Jumbo", Classe4.PESSOA_JURIDICA, Classe3.DEBITO);
        Classe1 cliente3 = new Classe1("Emília", Classe4.PESSOA_FISICA, Classe3.DEBITO);
        Classe1 cliente4 = new Classe1("Itamaraty", Classe4.PESSOA_JURIDICA, Classe3.CREDITO);
        Classe2.seuNome();

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}