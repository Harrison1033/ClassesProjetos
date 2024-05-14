package teste;
//

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa Destinado para rever temas já aprendidos
 * em cada classe terá uma descrição do que ela represnta
 * toda vez que o programa mudar, as descrições também devem mudar
 * por enquanto, eles estarão disponíveis no meu github para testar meu conhecimento git
 * ao final, espero está preparado para um projeto bem complexo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("1. Depositar\n" + "2. Sacar\n" + "3. Consultar Saldo\n" + "0. Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

