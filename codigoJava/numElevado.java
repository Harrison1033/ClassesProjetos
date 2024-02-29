
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Enter the radius value: ");
        double r = scan.nextDouble();
        double pi = 3.14159;
        double volume = ((4/3.0)* pi * Math.pow(r,3) );
        System.out.println("VOLUME = " + df.format(volume) );