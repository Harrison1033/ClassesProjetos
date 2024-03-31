package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor a ser convertido: ");
        double input = Double.parseDouble(scan.nextLine());
        scan.close();
		
        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);
		
        // TODO: Chamar o método para converter USD para a nova moeda desejada (por exemplo, JPY)
        double inputEUR = adapter.convertUSDtoEUR(input);
		
        // TODO: Imprimir o resultado da conversão
        System.out.println("USD: " + input);
		
        // TODO: Imprimir o resultado da conversão com a nova moeda (por exemplo, JPY)
        System.out.println("EUR: " + inputEUR);
    }

}
