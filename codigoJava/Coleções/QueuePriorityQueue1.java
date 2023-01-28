package teste;

import java.util.PriorityQueue;
import java.util.Queue;
//QueuePriorityQueue1
public class ClasseTres {
    public static void main(String[] args) {
        Queue<String>fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()){
            System.out.println(fila.poll());//imprime a sitring em ordem(o .remove faz o mesmo)
        }
    }
}
