package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
//Function
public class ClasseUm {
    public static void main(String[] args) {
        List<String>strings = List.of("Harrison","Kelly","Valentina");
        List<Integer>integers = map(strings, String::length);
        List<String>map = map(strings,String::toUpperCase);
        System.out.println(integers);
        System.out.println(map);
    }
    private static <T, R>List<R>map(List<T>list, Function<T, R>function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
