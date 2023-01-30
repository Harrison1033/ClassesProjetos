package teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
//QueuePrioritQueue2a
public class ClasseQuatro {
    public static void main(String[] args) {//Neste caso foi ordenado por preço
        Queue<ClasseDois> mangas = new PriorityQueue<>(Comparator.reverseOrder());//comparator.reverseOrder inverte a ordem
        mangas.add(new ClasseDois(5L, "Bleach     ", 19.95));
        mangas.add(new ClasseDois(1L, "Pokemon    ", 9.55));
        mangas.add(new ClasseDois(4L, "Hellsing   ", 3.22));
        mangas.add(new ClasseDois(3L, "Bersek     ", 11.25));
        mangas.add(new ClasseDois(2L, "Dragon Ball", 2.99));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}