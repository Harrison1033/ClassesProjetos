package estudando.classe1;

public class PrimeiraClasse {
    private double saldo;

    public PrimeiraClasse(double saldo) {

        this.saldo = saldo;
    }

    public void sacar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor digitado é negativo: ");
        }
        if (saldo - valor < 0) {
            throw new Exception("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}