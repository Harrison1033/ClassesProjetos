package br.com.harrison.classe;
import java.util.Scanner;

public class SmallestBiggest {
    public static void main(String[] args) {
        final int NUMBERS_TO_READ;
        Scanner scan = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        System.out.println("Enter the number of values ​​to enter");
        NUMBERS_TO_READ = scan.nextInt();

        for (int i = 0; i < NUMBERS_TO_READ; i++) {
            System.out.println("Enter the next integer: ");
            int num = scan.nextInt();
            if (num < minimum) {
                minimum = num;
            }
            if (num > maximum) {
                maximum = num;
            }
        }

        System.out.println("The smallest number is: " + minimum);
        System.out.println("The biggest number is: " + maximum);
    }
}