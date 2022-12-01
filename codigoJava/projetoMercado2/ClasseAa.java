package primeiroProjeto;

import java.util.Scanner;

public class ClasseAa {//soma de valores e quantidade de produtos
	Scanner scan = new Scanner(System.in);
	protected int quantidade, opcao;
	protected double valor1;
	protected double valor2 = 0;
	protected double resultado;
	
	public void imprimir() {
		while (true) {
			System.out.println("digite o valor do produto");
			valor1 = scan.nextDouble();
			System.out.println("digite a quantidade de produtos");
			quantidade = scan.nextInt();
			valor2 = valor1 * quantidade;
			resultado += valor2;
			System.out.println("Gostaria de cadastrar outro produto?\n(1) Sim\n(2) Não");
			opcao = scan.nextInt();
			if (opcao == 2) {
				break;
			}
		}
		System.out.printf("O valor total é: %.2f " , resultado);
		
	}

}
