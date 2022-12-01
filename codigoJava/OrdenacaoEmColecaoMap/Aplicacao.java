package estudando.classeMain;

import estudando.classe1.PrimeiraClasse;
import estudando.classe1.SegundaClasse;

import java.util.*;

public class MainClasse2 {
    public static void main(String[] args) {
        //ORDEM ALEATÓRIA
        Map<String, PrimeiraClasse> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new PrimeiraClasse("Uma Breve História do Tempo",256));
            put("Duhigg, Charles", new PrimeiraClasse("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new PrimeiraClasse("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String,PrimeiraClasse> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        //ORDEM ALFABÉTICA DE INSERÇÃO
        Map<String, PrimeiraClasse> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new PrimeiraClasse("Uma Breve História do Tempo",256));
            put("Duhigg, Charles", new PrimeiraClasse("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new PrimeiraClasse("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String,PrimeiraClasse> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        //ORDEM ALFABÉTICA DOS AUTORES(CHAVE)
        Map<String, PrimeiraClasse> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String,PrimeiraClasse> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        //ORDEM ALFABÉTICA NOME DOS LIVOS(Nome dos livros é um valor e por isso usamos o comparator)
        Set<Map.Entry<String, PrimeiraClasse>>meusLivros3 = new TreeSet<>(new SegundaClasse());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, PrimeiraClasse>livro : meusLivros3){
            System.out.println(livro.getKey()+ "-" + livro.getValue().getNome());
        }
//ORDEM POR NÚMERO DE PÁGINAS

    }
}