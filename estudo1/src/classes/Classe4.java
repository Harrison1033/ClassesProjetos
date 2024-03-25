package classes;
//TenPercentDiscount
// Implementações concretas do Strategy
public class Classe4 implements  Classe5{

    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }
}