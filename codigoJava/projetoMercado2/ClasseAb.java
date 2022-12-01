package primeiroProjeto;

import java.util.Scanner;

public class ClasseAb extends ClasseAa{//forma de pagamento
	Scanner scan = new Scanner(System.in);
	ClasseAa classeAa = new ClasseAa();
	protected int pagamento;
	protected int parcelas;
	protected double resultadoFinal;
	
	
	public void imprimir() {
		classeAa.imprimir();
		System.out.println("Digite a forma de pagamento: ");
		System.out.println("(1) Dinheiro\n(2) Débito\n(3) Crédito");
		pagamento = scan.nextInt();
				
		switch(pagamento) {
		case 1:
			resultadoFinal = classeAa.resultado - (classeAa.resultado * 0.1);
			System.out.printf("A vista: R$ %.2f", resultadoFinal);break;
		case 2:
			resultadoFinal = classeAa.resultado - (classeAa.resultado* 0.05);
			System.out.printf("No carão de débito: R$ %.2f", resultadoFinal);break;
		case 3:
			System.out.println("Escolha a opção de Parcelas:\n(1) De 1 a 5 parcelas");
			System.out.println("(2) De 6 a 10 parcelas\n(3) Acima de 10 parcelas");
			parcelas = scan.nextInt();
			if(parcelas > 0 && parcelas <= 5) {
				resultadoFinal = classeAa.resultado - (classeAa.resultado* 0.03);
				System.out.printf("No cartão de crédito: R$ %.2f", resultadoFinal);
				resultadoFinal = resultadoFinal / parcelas;
				System.out.printf("\nEm %d Parcelas Ficará: R$ %.2f a parcela", parcelas, resultadoFinal);
			}else if(parcelas > 5 && parcelas <= 10) {
				resultadoFinal = classeAa.resultado;
				System.out.printf("No cartão de crédito: R$ %.2f", resultadoFinal);
				resultadoFinal = resultadoFinal / parcelas;
				System.out.printf("\nEm %d Parcelas Ficará: R$ %.2f a parcela", parcelas, resultadoFinal);
			}else if(parcelas > 10) {
				resultadoFinal = classeAa.resultado + (classeAa.resultado * 0.05);
				System.out.printf("No cartão de crédito: R$ %.2f", resultadoFinal);
				resultadoFinal = resultadoFinal / parcelas;
				System.out.printf("\nEm %d Parcelas Ficará: R$ %.2f a parcela", parcelas, resultadoFinal);
			}
			break;
		default:
			System.out.println("Opção Inválida");
		
			}
		
	}

}
