
//parImpar
import java.util.Scanner;
public class Main {
    Scanner scan = new Scanner(System.in);
    
    public void imprimir(){
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        if (number % 2 == 0){
            System.out.println("The number: " + number + " is pair");
        }else {
            System.out.println("The number: " + number + " is odd");
        }

    }
}