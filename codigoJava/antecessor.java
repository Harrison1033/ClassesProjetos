package br.com.harrison.classe;
//Antecessor e sucessor

import java.util.Scanner;

public class TesteDois {
    Scanner scan = new Scanner(System.in);
    int number;
    int predecessor;
    int successor;

    public void imprimir(){
        System.out.println("Enter a number: ");
        number = scan.nextInt();
        predecessor = number - 1;
        successor = number + 1;
        System.out.println("The number is: " + number + "\nThe predecessor é: " + predecessor + "\nThe successor é: " + successor);

    }

}