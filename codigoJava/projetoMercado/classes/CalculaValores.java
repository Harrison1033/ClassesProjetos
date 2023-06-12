package projetoMercado.classes;

import java.util.Scanner;

public class CalculateValues extends Products{
    Scanner scan = new Scanner(System.in);
    double item = 0;
    int option;
    public CalculateValues( double value) {
        super( value);
    }
    public void calculate(){
        //continuara o código
        while (option != 3 ){
            System.out.println("Enter the product value: ");
            item = scan.nextDouble();
            value = value + item;
            System.out.println("Want to add a product?\nType 3 to finish: ");
            option = scan.nextInt();
        }
        System.out.println("The final value is: " + value);
    }
}
