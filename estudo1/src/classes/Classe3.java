package classes;

import java.util.Scanner;
//Main
public class Classe3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor a ser convertido: ");
        double input = Double.parseDouble(scan.nextLine());
        scan.close();
        Classe5 oldConverter = new Classe5();
        Classe4 adapter = new Classe4(oldConverter);
        // TODO: Chamar o método para converter USD para a nova moeda desejada (por exemplo, JPY)
        double inputEUR = adapter.convertUSDtoEUR(input);
        // TODO: Imprimir o resultado da conversão
        System.out.printf("USD: R$: %.2f\n" , input);
        // TODO: Imprimir o resultado da conversão com a nova moeda (por exemplo, JPY)
        System.out.printf("EUR: R$: %.2f" , inputEUR);

    }

}
