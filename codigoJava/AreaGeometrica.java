package br.com.harrison.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteMain01 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double a, b, c;
        double quadrado, circulo, trapezio, retangulo, triangulo;
        System.out.println("Digite o valor de A: ");
        a = scan.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = scan.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = scan.nextDouble();
        triangulo = (a * c)/2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a * b;
        System.out.println("Triangulo: " + df.format(triangulo));
        System.out.println("Circulo: " + df.format(circulo));
        System.out.println("Trapezio: " + df.format(trapezio));
        System.out.println("Quadrado: " + df.format(quadrado));
        System.out.println("Retangulo: " + df.format(retangulo));

    }
}
