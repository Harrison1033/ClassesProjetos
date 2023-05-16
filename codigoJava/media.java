//note e Média usando o for

package br.com.harrison.classe;

import java.util.Scanner;

public class Avarage {
    Scanner scan = new Scanner(System.in);
    public double note;
    public double increment;
    public  double average;

    public void print(){
        for (int i = 0; i < 3; i++){
            System.out.println("Type the note " + (i + 1));
            note = scan.nextDouble();
            increment += note;
        }
        average = increment / 3;
        System.out.print("Note: ");
        System.out.printf("%.2f", average);
        if (average >= 0 && average < 5){
            System.out.println("\nDISAPPROVED:");
        }else if (average >= 5 && average < 6){
            System.out.println("\nRECOVERY");
        }else if (average >= 6 && average <= 10 ){
            System.out.println("\nAPPROVATE, CONGRATULATIONS:");
        }else {
            System.out.println("\nInvalid Note:");
        }
    }
}