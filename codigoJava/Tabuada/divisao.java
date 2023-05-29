package bk.com.harrison.classes;

import java.util.Scanner;

public class Division {
    Scanner scan = new Scanner(System.in);
    double number;
    double cont = 1;

    public void printOut(){
        System.out.println("Enter a number for the division teble: ");
        number = scan.nextDouble();
        while (cont <= 10){
            System.out.println(number +" % "+ cont +" = "+ (number / cont));
            cont ++;
        }
    }
}