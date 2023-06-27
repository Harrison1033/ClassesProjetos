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
        PrimeiraClasse color = new PrimeiraClasse();
        SegundaClasse age = new SegundaClasse();
        QuartaClasse all = new QuartaClasse();
        List<TerceiraClasse> myCats = new ArrayList<>(){{
            add(new TerceiraClasse("Jon",18,"Preto"));
            add(new TerceiraClasse("Simba",6,"Tigrado"));
            add(new TerceiraClasse("Jon", 12,"Amarelo"));
        }};
        System.out.println(myCats);//Ordem de inserção
        //ordem aleatória
        Collections.shuffle(myCats);
        System.out.println(myCats);
        //Ordem natural
        Collections.sort(myCats);
        System.out.println(myCats);
        //Ordem por idade
        myCats.sort(new SegundaClasse());
        System.out.println(myCats);
        //Ordem por cor
        myCats.sort(new PrimeiraClasse());
        System.out.println(myCats);
        //Ordem por nome cor e idade (o critério é nesta ordem)
        myCats.sort(new QuartaClasse());
        System.out.println(myCats);

    }
}
