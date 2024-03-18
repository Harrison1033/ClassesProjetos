package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

//Com Scanner
public class Classe1 {
    Scanner scan = new Scanner(System.in);

    public void imprimir(){
        try {
            System.out.println("\nDigite um número inteiro");
            int num = scan.nextInt();
            // System.out.println(" ");
            for ( int i = 0;i<=num; i++) {
                if (i%2 !=0) {
                    System.out.print(i + " ");
                }
        }

        }catch (IllegalStateException | InputMismatchException e){
            System.out.println("Erro ao digitar o número");
        }
    }
}
