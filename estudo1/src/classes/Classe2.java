package classes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Desafio Bootcamp 04
public class Classe2  {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular: ");
        String titular = scanner.next();
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

 class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

 class ContaPoupanca extends ContaBancaria {
    private final double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        // Implementar adequadamente esta sobrecarga de construtores.
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        // Complementar as informações com a taxa de juros.
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de Juros: " + decimalFormat.format(taxaJuros) + "%");
    }
}
