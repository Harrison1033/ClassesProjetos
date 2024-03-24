package classes;
import java.util.InputMismatchException;
import java.util.Scanner;

import static classes.Implementa.addUsuario;
import static classes.Implementa.listUsuarios;

//Classe Main de User
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int quantidade;
            System.out.println("Digite um número:");
            quantidade = scan.nextInt();
            scan.nextLine();  // Consumir a quebra de linha após a leitura do número

            for (int i = 1; i <= quantidade; i++) {
                String nome;
                System.out.println("Digite o nome:");
                nome = scan.nextLine();
                addUsuario(i + " - " + nome);
            }
        }catch (InputMismatchException e){
            System.out.println("Erro, você deveria ter digitado um número inteiro: ");
        }
        listUsuarios();

    }

}
