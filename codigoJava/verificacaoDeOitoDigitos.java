package teste;

//Verificação de Número de Conta Bancária

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// TODO: Inicialize um bloco try-catch para capturar exceções:
        try {
            // Leia a entrada do usuário como uma string representando o número da conta:
            String numeroConta = scanner.nextLine();

            // Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);

            // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
			
            // Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:

            // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        // Verifique se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            // Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("O número da conta deve ter exatamente 8 dígitos.");
        }
    }
}
