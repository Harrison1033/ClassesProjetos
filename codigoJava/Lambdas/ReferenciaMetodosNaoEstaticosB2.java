package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//ReferenciaMetodosNaoEstaticosB2
public class ClasseTres {
    public static void main(String[] args) { //Coloca Strings em ordem alfabética
        List<String>list = new ArrayList<>(List.of("Rimuru","vledera","Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function <String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10"); //Transforma String para Integer
        System.out.println(num);

        BiPredicate<List<String>,String>checkName = List::contains;//Verificar se o nome está na lista
        System.out.println(checkName.test(list,"Hikimaru"));
    }
}
