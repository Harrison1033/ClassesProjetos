package primeiroProjeto;

import java.util.Scanner;

public class ClasseAa {//soma de valores e quantidade de produtos
	Scanner scan = new Scanner(System.in);
	protected int quantidade, opcao;
	protected double value1;
	protected double value2 = 0;
	protected double result;
	
	public void imprimir() {
		while (true) {
			System.out.println("Enter the product value");
			value1 = scan.nextDouble();
			System.out.println("Enter the quantity of products");
			quantidade = scan.nextInt();
			value2 = value1 * quantidade;
			result += value2;
			System.out.println("Would you like to register another product?\n(1) Yes\n(2) No");
			opcao = scan.nextInt();
			if (opcao == 2) {
				break;
			}
		}
		System.out.printf("The total amount is: %.2f " , result);
		
	}

}
