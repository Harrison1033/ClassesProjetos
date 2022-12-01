package estudando.classe1;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, double salario,int tempoEmpresa) {
        super(nome, idade, salario,tempoEmpresa);
    }

    @Override
    public void imprime() {
        this.salario=salario+salario*0.13;
        this.idade=idade+tempoEmpresa;
    }

    @Override
    public String toString() {
        return "Supervisor(a): {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", tempoEmpresa=" + tempoEmpresa +
                '}';
    }
}
