package teste;

import java.util.ArrayList;
import java.util.List;

//GenericsIntrodução
public class ClasseQuatro {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Pokemon");
        list.add("Bleach");
        list.add("DeathNote");

        for (String o : list) {
            System.out.println(o);
        }
        System.out.println("____________________");
        for (Object ob : list) {//Forma mais genérica
            System.out.println(ob);
        }
    }
}
