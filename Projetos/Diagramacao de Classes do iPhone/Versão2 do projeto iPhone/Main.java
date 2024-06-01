package classes;

import java.util.Scanner;

//Projeto iPhone utilizando das classes de 2 a 5

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IPhone iPhone = new IPhone();
		
        int opcao = 0;
		
        while (opcao == 0) {
            System.out.println("Qual opção Gostaria de Utilizar?");
            System.out.println("(a) Reprodutor musical\n(b) Telefone\n(c) Internet");
            String escolha = scan.next();
            if (escolha.equalsIgnoreCase("a")) {
                iPhone.selecionarMusica();
                iPhone.tocar();
                iPhone.pausar();
            } else if (escolha.equalsIgnoreCase("b")) {
                iPhone.atender();
                iPhone.ligar();
                iPhone.iniciarCorreioDeVoz();
            } else if (escolha.equalsIgnoreCase("c")) {
                iPhone.adicionarAba();
                iPhone.atualizarPagina();
                iPhone.exibir();
            } else {
                System.out.println("Opção inválida: ");
            }
            System.out.println("Gostaria de escolher outra opção? \n(0)\n(1)");
            opcao = scan.nextInt();
        }
    }
}
