package teste;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Destinado a fornecer 3 valores (a, b, c)
 * após os 3 valores serem digitados, serão feito os calculos das formas geométricas
 * no case seriam o círculo, tirângulo, quadrado, retãngulo e o traprézio
 * e por fim, o resultado impresso.
 */
public class Main1 {
    public static void main(String[] aargs) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        double a, b, c;
        double circulo, quadrado, triangulo, retangulo, trapezio;
        System.out.println("Digite o valor de a: ");
        a = scan.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = scan.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = scan.nextDouble();
        triangulo = (a * c)/2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = b * b;
        retangulo = a * b;
        System.out.println("Triângulo: " + df.format(triangulo));
        System.out.println("Círculo: " + df.format(circulo));
        System.out.println("Trapézio: " + df.format(trapezio));
        System.out.println("Quadrado: " + df.format(quadrado));
        System.out.println("Retângulo: " + df.format(retangulo));
    }
}