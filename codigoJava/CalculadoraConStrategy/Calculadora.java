package classes;

public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao){
        this.operacao = operacao;
    }
    public double performOperacao(double numero1, double numero2){
        return operacao.execute(numero1,numero2);
    }
}