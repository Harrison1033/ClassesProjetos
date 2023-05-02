package estudando.classeMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class MainClasse {
    public static void main(String[] args) {
//Criando uma lista e adicionando 7 valores
        List<Double> notes = new ArrayList<>();
        notes.add(7d);
        notes.add(3.5);
        notes.add(8.6);
        notes.add(4.6);
        notes.add(6.3);
        notes.add(1.8);
        notes.add(4.4);
        //Mostrar lista na ordem de inserção
        System.out.println(notes);// ou System.out.println( notes.toString());
        //Adicionar na lista a nota 8.0 na posição 4
        notes.add(4,8.0);
        System.out.println(notes);
        //Substituir 6.3 por 7.0
        notes.set(notes.indexOf(6.3),7.0);//notes.indexOf() mostra a posição pelo valor dado
        System.out.println(notes);
        //Conferir se a nota 1.8 está na lista
        System.out.println(notes.contains(1.8));
        //Exibir a somoa dos valores
        Iterator<Double> iterator = notes.iterator();
        Double sum = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);
        //Exibir a média das notes
        System.out.println((sum/notes.size()));
        //Exibir a terceira nota adicionada
        System.out.println(notes.get(2));
        //Exibir a menor nota
        System.out.println(Collections.min(notes));
        //Exibir a maior nota
        System.out.println(Collections.max(notes));
        //Remover a nota 1.8
        notes.remove(1.8);//se colocar o número inteiro ele procura pela posição
        System.out.println(notes);
        //Remover notes na posição 0;
        notes.remove(0);
        System.out.println(notes);
        //Apagar toda a lista
        notes.clear();
        System.out.println(notes);
        //Conferir se a lista está vazia
        System.out.println(notes.isEmpty());
    }
}
