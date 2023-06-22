package estudando.classeMain;

import estudando.classe1.PrimeiraClasse;
import estudando.classe1.SegundaClasse;

import java.util.*;

public class MainClasse2 {
    public static void main(String[] args) {
        //ORDEM ALEATÓRIA
        Map<String, PrimeiraClasse> myBooks = new HashMap<>(){{
            put("Hawking, Stephen", new PrimeiraClasse("Uma Breve História do Tempo",256));
            put("Duhigg, Charles", new PrimeiraClasse("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new PrimeiraClasse("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String,PrimeiraClasse> book: myBooks.entrySet()) {
            System.out.println(book.getKey() + "-" + book.getValue().getName());
        }
        //ORDEM ALFABÉTICA DE INSERÇÃO
        Map<String, PrimeiraClasse> myBooks1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new PrimeiraClasse("Uma Breve História do Tempo",256));
            put("Duhigg, Charles", new PrimeiraClasse("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new PrimeiraClasse("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String,PrimeiraClasse> book: myBooks1.entrySet()) {
            System.out.println(book.getKey() + "-" + book.getValue().getName());
        }
        //ORDEM ALFABÉTICA DOS AUTORES(CHAVE)
        Map<String, PrimeiraClasse> myBooks2 = new TreeMap<>(myBooks1);
        for (Map.Entry<String,PrimeiraClasse> book: myBooks2.entrySet()) {
            System.out.println(book.getKey() + "-" + book.getValue().getName());
        }
        //ORDEM ALFABÉTICA NOME DOS LIVOS(Nome dos books é um valor e por isso usamos o comparator)
        Set<Map.Entry<String, PrimeiraClasse>>myBooks3 = new TreeSet<>(new SegundaClasse());
        myBooks3.addAll(myBooks.entrySet());
        for (Map.Entry<String, PrimeiraClasse>book : myBooks3){
            System.out.println(book.getKey()+ "-" + book.getValue().getName());
        }
//ORDEM POR NÚMERO DE PÁGINAS

    }
}