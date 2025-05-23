package teste;
//Condições, Loops e Exceções na Prática com Java
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
        System.out.println("Informe o valor do limite diário:");
        double limiteDiario = scanner.nextDouble();
// Crie um loop 'for' para iterar sobre os saques:
        for (int i = 1; i <= 3; i++) {
            // Solicite ao usuário o valor do saque:
             System.out.println("Informe o valor do saque:");
            double valorSaque = scanner.nextDouble();
            // Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
                // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                } else if (valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque;
                // Informe que o saque foi realizado e mostre o limite restante:
                System.out.print("Saque realizado. ");
                System.out.printf("Limite restante: %.1f\n", limiteDiario);
            } else {
                // Se o valor do saque ultrapassar o limite diário, informe que o saque não pode ser realizado:
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}