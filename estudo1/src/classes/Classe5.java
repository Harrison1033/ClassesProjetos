package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Desafio Bootcamp1 (Registro de Transações Bancárias)
public class Classe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a Entrada que informa o saldo inicial da conta
        System.out.println("Digite o valor inicial de depósito: ");
        double saldo = scanner.nextDouble();
        
        // Lê a Entrada com a quantidade total de transações
        System.out.println("Digite a quantidade de tansações: ");
        int quantidadeTransacoes = scanner.nextInt();
        
        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
            // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
            System.out.println("Digite (d) para escolher depósito e (s) para escoler saque: ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            // Lê a Entrada com o valor da transação
            System.out.println("Digite o valor a ser sacado ou depositado de acordo com as opções escolhidas: ");
            double valorTransacao = scanner.nextDouble();

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        for (int i = 0; i < quantidadeTransacoes; i++) {
            //(.replaceAll("$[$]$", ""));)Tercho responsável por retirar os colchetes da impressão
            System.out.println((i + 1) + "." + transacoes.get(i).replaceAll("$[$]$", ""));
        }
        
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

}
