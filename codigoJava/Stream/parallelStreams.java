package teste;

import java.util.stream.Stream;
//parallelStreams
public class ClasseUm {
    public static void main(String[] args) {
        //verifica o número de threads a serem usados
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1;i <= num; i++){
            result +=1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumStreamIterate(long num){
        System.out.println("Sum sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L,i-> i+1).limit(num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumParallelStreamIterate (long num){//aproveitamento melhor que o código anterior
        System.out.println("Sum sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L,i->i+1).limit(num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
