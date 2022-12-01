package estudando.classeMain;

import estudando.classe1.PrimeiraClasse;
import estudando.classe1.QuartaClasse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClasse2 {
    public static void main(String[] args) {
        System.out.println("--\t Ordem Aleatório \t--");
        Set<QuartaClasse>minhasSeries = new HashSet<>(){{
            add(new QuartaClasse("got","fantasia",60));
            add(new QuartaClasse("dark","drama",60));
            add(new QuartaClasse("other","comedia",25));
        }};
        for(QuartaClasse quartaClasse: minhasSeries) System.out.println(quartaClasse.getNome()+"-"+ quartaClasse.getGenero()+"-"+quartaClasse.getTempoEpisodio());

        System.out.println("--\t Ordem de inserção \t--");
        Set<QuartaClasse> minhasSeries1 = new LinkedHashSet<>(){{
                add(new QuartaClasse("got", "fantasia", 60));
                add(new QuartaClasse("dark", "drama", 60));
                add(new QuartaClasse("other", "comedia", 25));
            }};
        for(QuartaClasse quartaClasse: minhasSeries1) System.out.println(quartaClasse.getNome()+"-"+ quartaClasse.getGenero()+"-"+quartaClasse.getTempoEpisodio());

        System.out.println("--\t Ordem Natural (Tempo de episódio)\t--");
        Set<QuartaClasse> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(QuartaClasse quartaClasse: minhasSeries2) System.out.println(quartaClasse.getNome()+"-"+ quartaClasse.getGenero()+"-"+quartaClasse.getTempoEpisodio());

        System.out.println("--\t OrdemNomeGeneroTempoEpisodio \t--");
        Set<QuartaClasse> minhasSeries3 = new TreeSet<>(new PrimeiraClasse());
        minhasSeries3.addAll(minhasSeries);
        for(QuartaClasse quartaClasse: minhasSeries3) System.out.println(quartaClasse.getNome()+"-"+ quartaClasse.getGenero()+"-"+quartaClasse.getTempoEpisodio());


    }
}