package br.com.harrison.classe;
//juros
import java.util.Scanner;
public class TesteDois {
    Scanner scan = new Scanner(System.in);
    double wage;
    double amount;

    public void imprimir(){
        System.out.println("Enter salary amount: ");
        wage = scan.nextDouble();
        amount = wage + (wage * 0.1);
        System.out.println("The entered value is: " + wage);
        System.out.println("With a 10% increase it will be: " + amount);

    }
}