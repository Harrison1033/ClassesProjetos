package classes;

// Implementações concretas do Strategy
public class TenPercentDiscount implements  DiscountStrategy{

    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }
}