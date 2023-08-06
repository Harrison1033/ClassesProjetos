package teste;

import java.util.Scanner;

public class NomeCli {
    Scanner scan = new Scanner(System.in);
    private String nomeCliente;
    public void nome(){
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scan.nextLine();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}
