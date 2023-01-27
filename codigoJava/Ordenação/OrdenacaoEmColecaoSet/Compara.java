package estudando.classe1;

import java.util.Comparator;

public class PrimeiraClasse implements Comparator<QuartaClasse> {


    @Override
    public int compare(QuartaClasse s1, QuartaClasse s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
