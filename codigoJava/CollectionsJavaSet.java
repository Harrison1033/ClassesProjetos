package estudando.classeMain;

import java.util.*;

/**
 * Interface Set
 * Não permite elementos duplicados
 * não possui índices
 */
public class MainClasse {
    public static void main(String[] args) {
        //Crie um conjunto e adicione as notas:
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);//Neste caso o 7d que se repete só vai aparecer uma vez;
        //Confira se a nota 5d está no conjunto;
        System.out.println(notas.contains(5d));
        //Exibir a menor nota:
        System.out.println(Collections.min(notas));
        //Exibir a maior nota:
        System.out.println(Collections.max(notas));
        //Exibir a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        //Exibir a média das notas
        System.out.println((soma/notas.size()));
        //Remover a nota 0.0:
        notas.remove(0d);
        System.out.println(notas);
        //Remover as notas menores que 7d:
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7.0) iterator1.remove();
        }
        System.out.println(notas);
        //Exibir notas na ordem que foram inseridas:
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas2);
        //Exibir todas as notas em ordem crescente:
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        //Apagar todoo o conjunto;
        notas.clear();
        System.out.println(notas);
        //Conferir se o conjunto está vazio:
        System.out.println(notas.isEmpty());
    }
}