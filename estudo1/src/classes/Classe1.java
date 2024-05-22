package classes;

import java.util.Scanner;

//Projeto iPhone utilizando das classes de 2 a 5
public class Classe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Classe2 classe2 = new Classe2();
        int opcao = 0;
        while (opcao == 0){
            System.out.println("Qual opção Gostaria de Utilizar?");
            System.out.println("(a) Reprodutor musical\n(b) Telefone\n(c) Internet");
            String escolha = scan.next();
            if (escolha.equalsIgnoreCase("a")){
                classe2.selecionarMusica();
                classe2.tocar();
                classe2.pausar();
            }else if (escolha.equalsIgnoreCase("b")){
                classe2.atender();
                classe2.ligar();
                classe2.iniciarCorreioDeVoz();
            }else if (escolha.equalsIgnoreCase("c")){
                classe2.adicionarAba();
                classe2.atualizarPagina();
                classe2.exibir();
            }else {
                System.out.println("Opção inválida: ");
            }
            System.out.println("Gostaria de escolher outra opção? \n(0)\n(1)");
            opcao = scan.nextInt();
        }
    }
}

