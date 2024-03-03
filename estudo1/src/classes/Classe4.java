package classes;

public class Classe4 {
    private String nome;
    static {
        System.out.println("Eis abaixo o nome: ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Classe4: " +
                "Nome = " + nome  ;
    }
}
