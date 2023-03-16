package teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

//GerandoStreamsP2
public class ClasseTres {
    public static void main(String[] args) {
//Iterate
        Stream.iterate(2, n -> n+2)//Conta o número partindo de 2 somando sempre com 2
                .limit(10)//Limota a 10 operações
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        //Série de fibonacci
        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(10)
                .forEach(a-> System.out.println(Arrays.toString(a)));
        System.out.println("------------------------------------------------");
        //Série de fibonacci imprimindo de outra forma
        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(10)
                .map(a->a[0])
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------");
//Generate(Gerando números aleatórios)
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(()->random.nextInt(1,100))
                .limit(10)
                .forEach(System.out::println);
    }
}