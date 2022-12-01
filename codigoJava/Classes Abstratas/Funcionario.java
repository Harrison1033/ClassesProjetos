package estudando.classe1;

public abstract class Funcionario {
   protected String nome;
   protected int idade;
   protected double salario;
   protected int tempoEmpresa;

    public Funcionario(String nome, int idade, double salario,int tempoEmpresa) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.tempoEmpresa = tempoEmpresa;
        imprime();
    }
    public abstract void imprime();//Método abstrato
}
