
//Antecessor e sucessor
/**
 * programa responsável por receber um número inteiro
 * em seguida mostrar o número digitado
 * depois mostrar o antecessor do númro digitado
 * e por fim o sucessor do númro digitado
 */


import java.util.Scanner;

public class AntecessorSucessor {
    Scanner scan = new Scanner(System.in);
    int number;
    int antecessor;
    int successor;

    public void imprimir(){
        System.out.println("Enter a number: ");
        number = scan.nextInt();
        antecessor = number - 1;
        successor = number + 1;
        System.out.println("The number is: " + number + "\nThe antecessor é: " + antecessor + "\nThe successor é: " + successor);

    }

}