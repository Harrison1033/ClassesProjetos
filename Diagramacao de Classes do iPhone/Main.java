package teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("1-Reprodutor Musical\n2-Aparelho Telefonico\n3-Navegador na Internet");
        int num = scan.nextInt();
        IPhone iPhone = new IPhone();
		
		if (num == 1) {
        System.out.println("-------Reprodutor Musical:-------");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
		} else if (num == 2) {
        System.out.println("-------Aparelho telefonico:-------");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioDeVoz();
		} else if (num == 3) {
        System.out.println("-------Navegador na Internet:-------");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
		  } else
            System.out.println("Opção Inválida:");
    }
}
