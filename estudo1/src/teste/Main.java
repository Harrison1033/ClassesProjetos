package teste;
//momodify10
/**
 * Programa Destinado para rever temas já aprendidos
 * em cada classe terá uma descrição do que ela represnta
 * toda vez que o programa mudar, as descrições também devem mudar
 * por enquanto, eles estarão disponíveis no meu github para testar meu conhecimento git
 * ao final, espero está preparado para um projeto bem complexo
 */

import java.util.Scanner;

// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
    public double convertUSDtoGBP(double amount) {
        return amount * 0.80; // 80% do valor em USD
    }
}

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;

    public CurrencyAdapter(OldCurrencyConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    // TODO: Implementar método de conversão de USD para outra moeda (por exemplo, JPY)
    // Dica: Você pode criar métodos adicionais conforme necessário.
    public double convertUSDtoEUR(double amount){
        double amountGBP = oldConverter.convertUSDtoGBP(amount);
        return amountGBP * 1.0625;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser Convertido: ");
        double input = Double.parseDouble(scanner.nextLine());

        scanner.close();

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