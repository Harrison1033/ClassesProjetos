package teste;

import java.util.List;
import java.util.ArrayList;
//ArreyList
public class Main {
    public static void main(String[] args) {

        List<String>strings = new ArrayList<>(List.of("1" , "3" , "5" , "7", "8"));
        strings.set(1,"A");
        strings.set(0,"H");
        strings.set(2,"R");
        strings.set(3,"R");
        strings.set(4,"I");
        strings.add(5,"S");
        strings.add(6,"O");
        strings.add(7,"N");
       

        System.out.println(strings);
        for (String string: strings) {
            System.out.println(string);
        }
        System.out.println("--------------------");
        System.out.println(strings.size());
    }
}