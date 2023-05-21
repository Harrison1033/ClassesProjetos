package br.com.harrison.principal;

import java.util.Scanner;

public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter the value of x1: ");
        double x1 = scan.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = scan.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = scan.nextDouble();
        System.out.println("Enter the value of y2");
        double y2 = scan.nextDouble();
        double dist = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));
        System.out.printf("%.4f%n", dist);
    }
}