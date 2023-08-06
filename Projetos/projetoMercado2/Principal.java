package primeiroProjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			ClasseAb segundo = new ClasseAb();
			boolean continua = true;
			int opcao;
			while(continua == true) {//resolver o problema abaixo
			segundo.printOut();//quando reinicia o processo o valor não retorna a zero
			System.out.println("Would you like to restarte the process?\n(1) Yes\n(2) No");
			opcao = scan.nextInt();
			if(opcao == 1) {
				continua = true;
			}else if(opcao == 2) {
				continua = false;
			}else {
				System.out.println("Invalid option:");
			}
				
			}
		}
	}

}
