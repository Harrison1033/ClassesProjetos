package teste;

import java.util.Objects;
//QueuePrioritQueue2b
public class ClasseDois implements Comparable<ClasseDois> {
    private Long id;
    private String nome;
    private double preco;

    public ClasseDois(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Mangá : " +
                "id = " + id +
                ", nome = " + nome +
                ", preço = R$:" + preco;
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
        if (!(o instanceof ClasseDois)) return false;
        ClasseDois that = (ClasseDois) o;
        return Double.compare(that.getPreco(), getPreco()) == 0 && Objects.equals(getId(), that.getId()) && Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getPreco());
    }

    @Override
    public int compareTo(ClasseDois outroManga) {//Ornena por id
//       if (this.id < outroManga.getId()){
//           return -1;
//       }else if (this.id.equals(outroManga.getId())){
//            return  0;
//        }else {
//           return 1;
//       }
        //return this.nome.compareTo(outroManga.getNome());//Classifica por nome
         return Double.compare(preco,outroManga.getPreco());//tipo primitivo classifica por preço
        //return this.id.compareTo(outroManga.getId());//Faz o mesmo que o código acima,classifica por id
    }//não se usa esta opção com tipos primitivos


}


