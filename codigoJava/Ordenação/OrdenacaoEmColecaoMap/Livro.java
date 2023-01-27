package estudando.classe1;

import java.util.Objects;

public class PrimeiraClasse  {
    private String nome;
    private Integer paginas;

    public PrimeiraClasse(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimeiraClasse)) return false;
        PrimeiraClasse that = (PrimeiraClasse) o;
        return getNome().equals(that.getNome()) && getPaginas().equals(that.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
