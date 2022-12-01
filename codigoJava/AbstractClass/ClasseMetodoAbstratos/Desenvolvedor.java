package estudando.classe1;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: {" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
