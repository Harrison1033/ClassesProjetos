package teste;

import java.util.Scanner;

// ContaTermanl
public class DadosConta {
	
        NomeCli nomeCliente = new NomeCliente();
		
        Scanner scan = new Scanner(System.in);
		
        public void imprimir(){
            System.out.println("Por favor, digite o número da Conta!");
            int numero = scan.nextInt();
            System.out.println("Digite o número da  Agência!");
            String agencia = scan.next();
            nomeCliente.nome();
            System.out.println("Digite o saldo da conta!");
            double saldo = scan.nextDouble();
            scan.close();

            System.out.println("Olá " + nomeCliente.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é " + 
			agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }


}