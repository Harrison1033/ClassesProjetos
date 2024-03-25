package classes;
//CurrencyAdapter
// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
public class Classe4 {
    private final Classe5 oldConverter;
    public Classe4(Classe5 oldConverter) {
        this.oldConverter = oldConverter;
    }
    // TODO: Implementar método de conversão de USD para outra moeda (por exemplo, JPY)
    // Dica: Você pode criar métodos adicionais conforme necessário.
    public double convertUSDtoEUR(double amount){
        double amountGBP = oldConverter.convertUSDtoGBP(amount);
        return amountGBP * 1.0625;
    }
}