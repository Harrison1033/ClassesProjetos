package teste;

import java.util.ArrayList;
import java.util.List;

//GenericsIntrodução
public class ClasseQuatro {
    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();
        lista.add("Pokemon");
        lista.add("Bleach");
        lista.add("DeathNote");

        for (String o : lista) {
            System.out.println(o);
        }
        System.out.println("____________________");
        for (Object ob : lista) {//Forma mais genérica
            System.out.println(ob);
        }
    }
}
