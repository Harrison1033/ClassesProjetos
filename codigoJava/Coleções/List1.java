package teste;

import java.util.ArrayList;
import java.util.List;
//List1
public class Main{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes1 = new ArrayList<>(16);
        nomes.add("Keliane");
        nomes.add("Harrison");
        nomes.add("Goldofredo");
        nomes.add("Astoufo");
        nomes1.add("Lima");
        nomes1.add("Oliveira");
        nomes.remove("Astoufo");//Remove pelo equals
        nomes.remove(2);//Remove pelo índice
        nomes.addAll(nomes1);//Adiciona todos os elementos de nomes1 para nomes


        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
