package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Desafio Bootcamp2 (Melhoria do desafio 01 )
public class Classe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite a Quantia de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.println("Digite o tipo de transação: (d)para depósito e (s)para saque: ");
            char tipoTransacao = scanner.next().charAt(0);
            System.out.println("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // Criar uma nova transação e adicioná-la à lista
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);


            // Verifica e atualiza o saldo da conta com base no tipo de transação
//            if (transacao.getTipo().toUpperCase() == 'D') {
//                saldo += valorTransacao;
//            } else if (transacao.getTipo().toUpperCase() == 'S') {
//                saldo -= valorTransacao;
//            }
            if (transacao.getTipo() == 'D'||transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("Saldo:" + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> String.format("%s de %.1f", transacao.getTipo(), transacao.getValor()))
                //.collect(Collectors.toList())
                .toList()
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
    
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

}