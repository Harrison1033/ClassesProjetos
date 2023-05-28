package bk.com.harrison.classes;

import java.util.Scanner;

public class multiplication {
    Scanner scan = new Scanner(System.in);
    double number;
    double cont = 1;

    public void printOut(){
        System.out.println("Enter a number for the multiplication table");
        number = scan.nextDouble();
        while (cont <= 10 ){
            System.out.println(number +" X "+ cont +" = "+ (number * cont));
            cont ++;
        }
    }
}