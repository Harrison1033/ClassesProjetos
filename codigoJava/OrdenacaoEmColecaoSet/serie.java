package estudando.classe1;

import java.util.Objects;

public class QuartaClasse implements Comparable<QuartaClasse>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public QuartaClasse(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuartaClasse)) return false;
        QuartaClasse that = (QuartaClasse) o;
        return getNome().equals(that.getNome()) && getGenero().equals(that.getGenero()) && getTempoEpisodio().equals(that.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(QuartaClasse serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
       if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
