package estudando.classe1;

public class Atendente extends Funcionario {


    public Atendente(String nome, int idade, double salario,int tempoEmpresa) {
        super(nome, idade, salario,tempoEmpresa);
    }

    @Override
    public void imprime() {//método sobrescrito
        this.salario=salario+salario*0.1;
        this.idade = idade+tempoEmpresa;
        this.nome=nome+" Paiva";
    }

    @Override//ToString para mostrar os valores
    public String toString() {
        return "Atendente: {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", tempoEmpresa=" + tempoEmpresa +
                '}';
    }
}