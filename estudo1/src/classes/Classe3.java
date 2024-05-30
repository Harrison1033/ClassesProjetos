package classes;

import java.util.Scanner;
//Desafio bootcamp3(Conta Bancária com Construtor em POO)
public class Classe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Criar uma nova conta bancária com o saldo inicial
        System.out.println("Digite um saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        ContaBancarias conta = new ContaBancarias(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        System.out.println("Digite um valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        System.out.println("Digite um valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancarias {
    private double saldo;

    public ContaBancarias(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        //  Incrementar o saldo com o valor e imprimir "Deposito feito."
        this.saldo+=valor;
        System.out.println("Deposito feito. ");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        //  Verificar se o saldo é suficiente considerando o valor:
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        if (this.saldo >= valor){
            this.saldo-=valor;
            System.out.println("Saque feito. ");
        }else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}
