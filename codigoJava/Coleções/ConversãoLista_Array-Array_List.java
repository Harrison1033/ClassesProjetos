package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ConversãoLista_Array-Array_List
public class Main{
    public static void main(String[] args) {
        //De list para array
        List<Integer>numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        //de array para list
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        //não aconselhável para modificar a lista
        List<Integer>arrayToList = Arrays.asList(numerosArray);
        System.out.println("___________________________________");
        System.out.println(arrayToList);
        //aconselhável para modificar a lista posteriormente
        List<Integer>numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        System.out.println("-----------------------------------");
        numerosList.add(0,7);
        System.out.println(numerosList);
        //Para fazer listas em uma única linha
        List<String>strings = Arrays.asList("Ada","Bada","cada");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println(strings);
        System.out.println(integers);
    }
}