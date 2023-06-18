package estudando.classe1;

import java.util.Comparator;

public class PrimeiraClasse implements Comparator<QuartaClasse> {


    @Override
    public int compare(QuartaClasse s1, QuartaClasse s2) {
        int name = s1.getName().compareTo(s2.getName());
        if (name != 0) return name;

        int gender = s1.getGender().compareTo(s2.getGender());
        if (gender != 0) return gender;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
