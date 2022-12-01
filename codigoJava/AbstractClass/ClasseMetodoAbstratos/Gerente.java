package estudando.classe1;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {
        this.salario = salario+salario*0.1;
    }

    @Override
    public String toString() {
        return "Gerente: {" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
