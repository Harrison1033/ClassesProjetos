package teste;

import java.util.Objects;
//Iterator2
public class ClasseUm implements Comparable<ClasseUm> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public ClasseUm(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Mangá: " +
                "id=" + id +
                ", nome= " + nome +
                ", preço R$: " + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClasseUm)) return false;
        ClasseUm classeUm = (ClasseUm) o;
        return getId().equals(classeUm.getId()) && getNome().equals(classeUm.getNome()) && getPreco().equals(classeUm.getPreco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getPreco());
    }

    @Override
    public int compareTo(ClasseUm outroManga) {//Ornena por id
        return this.id.compareTo(outroManga.getId());//Faz o mesmo que o código acima,classifica por id
    }//não se usa esta opção com tipos primitivos
}
