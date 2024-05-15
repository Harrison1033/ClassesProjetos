package teste;
//Verificação de Número de Conta Bancária

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

        int idade = scanner.nextInt();

//  Verifique se a idade é maior ou igual a 18 e imprima uma mensagem informando que o usuário é elegível para criar uma conta bancária:
        if (idade >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
