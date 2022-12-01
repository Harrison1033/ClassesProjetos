package estudando.classeMain;

import estudando.classe1.PrimeiraClasse;
import estudando.classe1.QuartaClasse;
import estudando.classe1.SegundaClasse;
import estudando.classe1.TerceiraClasse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Primeira classe referente a cor
 * Segunda classe referente a idade
 * quarta classe referente a nome, cor e idade
 */
public class MainClasse2 {
    public static void main(String[] args) {
        PrimeiraClasse cor = new PrimeiraClasse();
        SegundaClasse idade = new SegundaClasse();
        QuartaClasse tudo = new QuartaClasse();
        List<TerceiraClasse> meusGatos = new ArrayList<>(){{
            add(new TerceiraClasse("Jon",18,"Preto"));
            add(new TerceiraClasse("Simba",6,"Tigrado"));
            add(new TerceiraClasse("Jon", 12,"Amarelo"));
        }};
        System.out.println(meusGatos);//Ordem de inserção
        //ordem aleatória
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        //Ordem natural
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        //Ordem por idade
        meusGatos.sort(new SegundaClasse());
        System.out.println(meusGatos);
        //Ordem por cor
        meusGatos.sort(new PrimeiraClasse());
        System.out.println(meusGatos);
        //Ordem por nome cor e idade (o critério é nesta ordem)
        meusGatos.sort(new QuartaClasse());
        System.out.println(meusGatos);

    }
}
