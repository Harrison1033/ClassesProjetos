package projetoMercado.classes;

import java.util.Scanner;

public class FormaPagamento extends CalculaValores{
    Scanner scan = new Scanner(System.in);
    Money money = new Money(0);
    DebitCard debitCard = new DebitCard(0);
    CreditCard creditCard = new CreditCard(0);
    int option;

    public FormaPagamento(double value) {
        super(value);
    }

    public void fPayment(){
        System.out.println("What id the payment method? ");
        System.out.println("(1) money\n(2) debit card\n(3) credit card");
        opcao = scan.nextInt();
        if (option == 1){
            money.moneyCalc();
        }else if (option == 2){
            debitCard.debitCalc();
        }else if (option == 3){
            creditCard.creditCalc();
        }else {
            System.out.println("Invalid Option: ");
        }

    }
}
