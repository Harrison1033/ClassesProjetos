package primeiroProjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			ClasseAb segundo = new ClasseAb();
			boolean continua = true;
			int opcao;
			while(continua == true) {//resolver o problema abaixo
			segundo.imprimir();//quando reinicia o processo o valor não retorna a zero
			System.out.println("Gostaria de reiniciar o processo?\n(1) Sim\n(2) Não");
			opcao = scan.nextInt();
			if(opcao == 1) {
				continua = true;
			}else if(opcao == 2) {
				continua = false;
			}else {
				System.out.println("Opção Inválida:");
			}
				
			}
		}
	}

}
