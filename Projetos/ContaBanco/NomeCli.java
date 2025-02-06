package teste;

import java.util.Scanner;

public class NomeCliente {
    Scanner scan = new Scanner(System.in);
    private String nomeClient;
    public void nome(){
        System.out.println("Por favor, digite o nome do cliente!");
        nomeClient = scan.nextLine();
    }

    public String getNomeClient() {
        return nomeClient;
    }
}
