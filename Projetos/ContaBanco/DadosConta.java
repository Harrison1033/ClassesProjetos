package teste;

import java.util.Scanner;

//ContaTermanl
public class DadosConta {
        NomeCli nomeCli = new NomeCli();
        Scanner scan = new Scanner(System.in);
        public void imprimir(){
            System.out.println("Por favor, digite o número da Agência!");
            int numero = scan.nextInt();
            System.out.println("Digite a Agência!");
            String agencia = scan.next();
            nomeCli.nome();
            System.out.println("Digite o saldo da conta!");
            double saldo = scan.nextDouble();
            scan.close();

            System.out.println("Olá " + nomeCli.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }


}