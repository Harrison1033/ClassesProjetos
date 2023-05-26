package bk.com.harrison.classes;

import java.util.Scanner;

public class Subtraction {
    Scanner scan = new Scanner(System.in);
    double number;
    double cont = 0;

    public void printOut(){
        System.out.println("Enter a number for the subtraction table: ");
        number = scan.nextDouble();
        while (cont <= 10){
            System.out.println(numero +" - "+ cont +" = "+ (number - cont));
            cont ++;
        }
    }
}