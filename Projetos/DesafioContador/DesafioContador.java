package teste;

import java.util.Scanner;

//Desafio de código(Contador)
public class Main {
    public static void main(String[] aargs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = scan.nextInt();
        try {
            if (numero1 > numero2) {
                //A exceção IllegalArgumentException é usada para indicar que o segundo número deve ser maior que o primeiro.
                throw new IllegalArgumentException("O segundo número deve ser maior que o primeiro.");
            }

            contar(numero1, numero2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int numero1, int numero2) {
        //O loop for é usado para imprimir os números entre numero1 e numero2.
        for (int i = numero1; i < numero2; i++) {
            System.out.println(i);
        }
    }
}