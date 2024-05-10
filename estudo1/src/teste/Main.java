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
        Scanner scan = new Scanner(System.in);
        String nome;
        double num1;
        double num2;
        try {
        System.out.println("Digite a operação");
        nome = scan.nextLine();
        System.out.println("Digite um número: ");
        num1 = scan.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = scan.nextDouble();

            if (nome.equalsIgnoreCase("Soma") || nome.equalsIgnoreCase("+")) {
                System.out.printf("%.2f",num1 + num2);
            } else if (nome.equalsIgnoreCase("subtração") || nome.equalsIgnoreCase("-")) {
                System.out.printf("%.2f",num1 - num2);
            } else if (nome.equalsIgnoreCase("multiplicação") || nome.equalsIgnoreCase("*")) {
                System.out.printf("%.2f", num1 * num2);
            } else if (nome.equalsIgnoreCase("Divisão") || nome.equalsIgnoreCase("/")) {
                System.out.printf("%.2f", num1 / num2);
            } else {
                System.out.println("Opção inválida:");
            }
        }catch (InputMismatchException e){
            System.out.println("Digite somente números: -> " + e);
        }

    }
}