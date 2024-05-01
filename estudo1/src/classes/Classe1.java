package classes;

import java.util.Scanner;

//Main1 (informações de conta)
public class Classe1 {
    Scanner scan = new Scanner(System.in);
    int numero;
    String agencia;

    public void imprimir() {
        System.out.println("Por favor, digite o número da conta: ");
        numero = scan.nextInt();
        System.out.println("Agora digite o número da agência: ");
        agencia = scan.next();
    }

    public double getSaldo() {
        return 237.37;
    }
}

