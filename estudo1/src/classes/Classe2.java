package classes;

import java.util.Scanner;

//Main1 Cliente(nome)
public class Classe2 {
    Scanner scan = new Scanner(System.in);
    Classe1 classe1 = new Classe1();

    public void imprimir() {
        System.out.println("Digite o nome");
        String nomeCliente = scan.next();
        System.out.println("Digite o sobre nome");
        String sobrenomeCliente = scan.next();
        classe1.imprimir();
        System.out.print("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + classe1.agencia + ",conta " + classe1.numero + " e saldo " + classe1.getSaldo() + " á está disponível para saque");
    }
}
