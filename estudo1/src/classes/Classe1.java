package classes;

import java.util.Scanner;

public class Classe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Classe2 classe2 = new Classe2();
        Classe4 classe4 = new Classe4("Usuário 1");

        classe2.addObserver(classe4);
        System.out.println("Digite o Nome do Produto: ");
        String name = scan.nextLine();
        System.out.println("Digite a marca do produto: ");
        String description = scan.nextLine();
        System.out.println("Digite o preço do produto: ");
        double price = scan.nextDouble();

        scan.nextLine();
        System.out.println("Gostaria de confirmar o pedido? ");
        String subscribeChoice = scan.nextLine();

        scan.close();

        classe2.addProduct(name, description, price, subscribeChoice);

    }

}

