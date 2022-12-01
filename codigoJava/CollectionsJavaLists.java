package estudando.classeMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class MainClasse {
    public static void main(String[] args) {
//Criando uma lista e adicionando 7 valores
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(3.5);
        notas.add(8.6);
        notas.add(4.6);
        notas.add(6.3);
        notas.add(1.8);
        notas.add(4.4);
        //Mostrar lista na ordem de inserção
        System.out.println(notas);// ou System.out.println( notas.toString());
        //Adicionar na lista a nota 8.0 na posição 4
        notas.add(4,8.0);
        System.out.println(notas);
        //Substituir 6.3 por 7.0
        notas.set(notas.indexOf(6.3),7.0);//notas.indexOf() mostra a posição pelo valor dado
        System.out.println(notas);
        //Conferir se a nota 1.8 está na lista
        System.out.println(notas.contains(1.8));
        //Exibir a somoa dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        //Exibir a média das notas
        System.out.println((soma/notas.size()));
        //Exibir a terceira nota adicionada
        System.out.println(notas.get(2));
        //Exibir a menor nota
        System.out.println(Collections.min(notas));
        //Exibir a maior nota
        System.out.println(Collections.max(notas));
        //Remover a nota 1.8
        notas.remove(1.8);//se colocar o número inteiro ele procura pela posição
        System.out.println(notas);
        //Remover notas na posição 0;
        notas.remove(0);
        System.out.println(notas);
        //Apagar toda a lista
        notas.clear();
        System.out.println(notas);
        //Conferir se a lista está vazia
        System.out.println(notas.isEmpty());
    }
}
