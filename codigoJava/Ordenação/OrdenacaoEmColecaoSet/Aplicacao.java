package estudando.classeMain;

import estudando.classe1.PrimeiraClasse;
import estudando.classe1.QuartaClasse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClasse2 {
    public static void main(String[] args) {
        System.out.println("--\t Random order \t--");
        Set<QuartaClasse>mysSeries = new HashSet<>(){{
            add(new QuartaClasse("got","fantasia",60));
            add(new QuartaClasse("dark","drama",60));
            add(new QuartaClasse("other","comedia",25));
        }};
        for(QuartaClasse quartaClasse: mySeries) System.out.println(quartaClasse.getName()+"-"+ quartaClasse.getGender()+"-"+quartaClasse.getTimeEpisode());

        System.out.println("--\t Insertion order \t--");
        Set<QuartaClasse> mySeries1 = new LinkedHashSet<>(){{
                add(new QuartaClasse("got", "fantasia", 60));
                add(new QuartaClasse("dark", "drama", 60));
                add(new QuartaClasse("other", "comedia", 25));
            }};
        for(QuartaClasse quartaClasse: mySeries1) System.out.println(quartaClasse.getName()+"-"+ quartaClasse.getGender()+"-"+quartaClasse.getTimeEpisode());

        System.out.println("--\t Natural order (Time episode)\t--");
        Set<QuartaClasse> mySeries2 = new TreeSet<>(mySeries1);
        for(QuartaClasse quartaClasse: mySeries2) System.out.println(quartaClasse.getName()+"-"+ quartaClasse.getGender()+"-"+quartaClasse.getTimeEpisode());

        System.out.println("--\t OrderNameGenreTimeEpisode \t--");
        Set<QuartaClasse> mySeries3 = new TreeSet<>(new PrimeiraClasse());
        minhasSeries3.addAll(mySeries);
        for(QuartaClasse quartaClasse: mySeries3) System.out.println(quartaClasse.getName()+"-"+ quartaClasse.getGender()+"-"+quartaClasse.getTimeEpisode());


    }
}