package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//BinarySearch1
public class ClasseQuatro {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,2));//mostra posição do número 0 pós ordenação
        System.out.println(Collections.binarySearch(numeros,5));//mostra suposta posição de número inexistente
    }
}
