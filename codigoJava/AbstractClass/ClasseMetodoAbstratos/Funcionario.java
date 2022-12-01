package estudando.classe1;

public abstract class Funcionario {
   protected String nome;
   protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        imprime();
    }
    public abstract void imprime();
}
