package teste;

import java.util.ArrayList;
import java.util.List;
//List1
public class Main{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Keliane");
        nomes.add("Harrison");
        nomes.add("Goldofredo");
        nomes.add("Astoufo");

        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
