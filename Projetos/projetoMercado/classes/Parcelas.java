package projetoMercado.classes;

import java.util.Scanner;

public class Installments extends CreditoCartao{
    Scanner scan = new Scanner(System.in);
    int installments;
    double total;
    public Installments(double value) {
        super(value);
    }
    public void installmentsCalc(){
        System.out.println("Enter the number of installments up to 12X ");
        installments = scan.nextInt();
        if (installments > 0 && installments <= 4){
           total = installments - (installments * 0.1);
        }else if (installments > 4 && installments <= 8){
            total = installments - (installments * 0.05);
        }else if (installments > 8 && installments <= 12){
            total = installments + (installments * 0.05 );
        }else {
            System.out.println("Only allowed up to 12 installments:  ");
        }
    }
}
