import java.util.*;
/**
 * Interface Set
 * Não permite elementos duplicados
 * não possui índices
 */
public class Main {
    public static void main(String[] args) {
        //Crie um conjunto e adicione as notes:
        Set<Double> notes = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notes);//Neste caso o 7d que se repete só vai aparecer uma vez;
        //Confira se a nota 5d está no conjunto;
        System.out.println(notes.contains(5d));
        //Exibir a menor nota:
        System.out.println(Collections.min(notes));
        //Exibir a maior nota:
        System.out.println(Collections.max(notes));
        //Exibir a sum dos valores
        Iterator<Double> iterator = notes.iterator();
        Double sum = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);
        //Exibir a média das notes
        System.out.println((sum/notes.size()));
        //Remover a nota 0.0:
        notes.remove(0d);
        System.out.println(notes);
        //Remover as notes menores que 7d:
        Iterator<Double> iterator1 = notes.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7.0) iterator1.remove();
        }
        System.out.println(notes);
        //Exibir notes na ordem que foram inseridas:
        Set<Double> notes2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notes2);
        //Exibir todas as notes em ordem crescente:
        Set<Double> notes3 = new TreeSet<>(notes2);
        System.out.println(notes3);
        //Apagar todoo o conjunto;
        notes.clear();
        System.out.println(notes);
        //Conferir se o conjunto está vazio:
        System.out.println(notes.isEmpty());
    }
}