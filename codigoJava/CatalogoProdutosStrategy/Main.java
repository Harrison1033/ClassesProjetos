import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Catalog catalog = new Catalog();
        User user = new User("Usuário 1");

        catalog.addObserver(user);
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

        catalog.addProduct(name, description, price, subscribeChoice);

    }

}
