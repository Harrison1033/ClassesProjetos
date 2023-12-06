import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        double a, b, c;
        double square, circle, trapeze, rectangle, triangle;
        System.out.println("Enter the value of A: ");
        a = scan.nextDouble();
        System.out.println("Enter the value of B: ");
        b = scan.nextDouble();
        System.out.println("Enter the value of C: ");
        c = scan.nextDouble();
        triangle = (a * c)/2;
        circle = 3.14159 * Math.pow(c,2);
        trapeze = ((a+b)*c)/2;
        square = b*b;
        rectangle = a * b;
        System.out.println("Triangle: " + df.format(triangle));
        System.out.println("Circle: " + df.format(circle));
        System.out.println("Trapeze: " + df.format(trapeze));
        System.out.println("Square: " + df.format(square));
        System.out.println("Rectangle: " + df.format(rectangle));

    }
}
