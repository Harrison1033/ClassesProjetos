package teste;

public class ClasseUm {
    private String nome;

    public ClasseUm(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome='" + nome + '\'' + '}';
    }
}

