package teste;
/**
 * programa responsável por receber um número inteiro
 * em seguida mostrar o número digitado
 * depois mostrar o antecessor do númro digitado
 * e por fim o sucessor do númro digitado
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] aargs) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int antecessor;
        int sucessor;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();
        antecessor = numero -1 ;
        sucessor = numero + 1;
        System.out.println("O número é: " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " + sucessor);

    }
}