package bk.com.harrison.principal;

import bk.com.harrison.classes.Sum;
import bk.com.harrison.classes.Subtraction;
import bk.com.harrison.classes.Multiplication;
import bk.com.harrison.classes.Division;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Sum sum = new Sum();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        int opc;
        String opc2 = "y";

        while ("y".equals(opc2)) {
            System.out.println("Enter the desired operation: \n(1) Sum\n(2) Subtraction\n(3) Multiplication\n(4) Division");
            opc = scan.nextInt();
            if (opc == 1) {
                sum.imprimir();
            } else if (opc == 2) {
                subtraction.imprimir();
            } else if (opc == 3) {
                multiplication.imprimir();
            } else if (opc == 4) {
                division.imprimir();
            } else {
                System.out.println("Invalid option: ");
            }
            System.out.println("Would you like to continue? \n(y) Yes\n(n) No");
            opc2 = scan.next();
        }
    }
}
