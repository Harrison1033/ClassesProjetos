package estudando.classe1;

public class TerceiraClasse implements Comparable<TerceiraClasse> {
    private String nome;
    private Integer idade;
    private String cor;

    public TerceiraClasse(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(TerceiraClasse terceiraClasse) {
        return this.getNome().compareToIgnoreCase(terceiraClasse.getNome());

    }
}