package primeiroProjeto;

import java.util.Scanner;

public class ClasseAb extends ClasseAa{//forma de payment
	Scanner scan = new Scanner(System.in);
	ClasseAa classeAa = new ClasseAa();
	protected int payment;
	protected int installments;
	protected double finalResult;
	
	
	public void imprimir() {
		classeAa.imprimir();
		System.out.println("Enter payment method: ");
		System.out.println("(1) Money\n(2) Debit\n(3) Credit");
		payment = scan.nextInt();
				
		switch(payment) {
		case 1:
			finalResult = classeAa.resultado - (classeAa.resultado * 0.1);
			System.out.printf("A vista: R$ %.2f", finalResult);break;
		case 2:
			finalResult = classeAa.resultado - (classeAa.resultado* 0.05);
			System.out.printf("On debit card: R$ %.2f", finalResult);break;
		case 3:
			System.out.println("Choose installment option:\n(1) from 1 to 5 installments");
			System.out.println("(2) From 6 to 10 installments\n(3) Above 10 installments");
			installments = scan.nextInt();
			if(installments > 0 && installments <= 5) {
				finalResult = classeAa.resultado - (classeAa.result* 0.03);
				System.out.printf("On credit card: R$ %.2f", finalResult);
				finalResult = finalResult / installments;
				System.out.printf("\nEm %d installments will remain: R$ %.2f the parcel", installments, finalResult);
			}else if(installments > 5 && installments <= 10) {
				finalResult = classeAa.result;
				System.out.printf("On credit card: R$ %.2f", finalResult);
				finalResult = finalResult / installments;
				System.out.printf("\nEm %d installments will remain: R$ %.2f the parcel", installments, finalResult);
			}else if(installments > 10) {
				finalResult = classeAa.resultado + (classeAa.resultado * 0.05);
				System.out.printf("On credit card: R$ %.2f", finalResult);
				finalResult = finalResult / installments;
				System.out.printf("\nEm %d installments will remain: R$ %.2f the parcel", installments, finalResult);
			}
			break;
		default:
			System.out.println("Invalid option");
		
			}
		
	}

}
