package classes;

import java.util.stream.IntStream;

public class Classe3 {
    //protected int num1=0;
    protected int num2=3;

    public void imprimir(){
        IntStream.rangeClosed(0, 10).
                mapToObj(i -> num2 + " X " + i + " = " + num2 * i).
                forEach(System.out::println);
    }
}
