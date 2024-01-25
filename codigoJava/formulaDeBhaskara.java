package br.com.harrison1.classeA;
import java.util.Scanner;
public class main {
    Scanner scan = new Scanner(System.in);
    double a;
    double b;
    double c;

    public void imprimir(){
        System.out.println("Enter the value of A:");
        a = scan.nextDouble() ;
        System.out.println("Enter the value of B:");
        b = scan.nextDouble();
        System.out.println("Enter the value of C:");
        c = scan.nextDouble();

        if ((a == 0) | (b * b - 4 * a * c < 0)){
            System.out.println("Impossible to calculate");
            return;
        }
        double raizQ = Math.sqrt((b * b) - 4 * a * c);
        double R1 = (-b + raizQ) / (2 * a);
        double R2 = (-b - raizQ) / (2 * a);
        System.out.printf("R1 = %.5f\n", R1);
        System.out.printf("R2 = %.5f\n", R2);



    }
}