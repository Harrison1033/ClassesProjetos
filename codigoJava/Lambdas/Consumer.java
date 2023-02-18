package teste;

import java.util.List;
import java.util.function.Consumer;
//Consumer
public class MainUm {
    public static void main(String[] args) {
        List<String>strings = List.of("Ada","Eda","Ida","Oda");
        List<Integer>integers= List.of(1,2,3,4);
//        forEach(strings,s -> System.out.println(s));
//        forEach(integers,i -> System.out.println(i));
        forEach(strings, System.out::println);//Faz o mesmo que o código acima
        forEach(integers, System.out::println);
    }
    private static <T> void forEach(List<T>list, Consumer<T>consumer){
        for (T e: list){
            consumer.accept(e);
        }
    }
}