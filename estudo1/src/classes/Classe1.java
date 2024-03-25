package classes;

import java.util.Scanner;

//Main
public class Classe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Criando instâncias das estratégias de desconto
        Classe5 classe4 = new Classe4();
        Classe5 classe3 = new Classe3();
        // Criando o carrinho de compras
        Classe2 cart = new Classe2();
        // Adicionando produtos ao carrinho
        System.out.println("Digite o nome do produto:");
        String productName = scan.nextLine();
        System.out.println("Digite o preço do produto:");
        double productPrice = scan.nextDouble();
        cart.addProduct(productPrice);
        // Escolhendo a estratégia de desconto
        System.out.println("Digite como quer comprar: \n(1) 10% de desconto\n(2) Frete grátis");
        int strategyChoice = scan.nextInt();
        // Configurando a estratégia no carrinho
        switch (strategyChoice){
            case 1 -> cart.setDiscountStrategy(classe4);
            case 2 -> cart.setDiscountStrategy(classe3);
            default -> System.out.println("Escolha invalida. Nenhum desconto aplicado.");
        }
        // TODO: Chamar o método calculateTotal e exibir o resultado
        double total = cart.calculateTotal();
        System.out.printf("Total da compra: R$%.1f" , total);

    }

}

