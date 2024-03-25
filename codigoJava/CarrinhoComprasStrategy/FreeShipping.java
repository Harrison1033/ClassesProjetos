package classes;

// Implementações concretas do Strategy
public class FreeShipping implements DiscountStrategy {

    @Override
    public double applyDiscount(double total) {
        System.out.println("Frete grátis aplicado:");
        return total;
    }
}
