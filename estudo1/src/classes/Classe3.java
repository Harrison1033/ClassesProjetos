package classes;
//FreeShipping
// Implementações concretas do Strategy
public class Classe3 implements Classe5 {

    @Override
    public double applyDiscount(double total) {
        System.out.println("Frete grátis aplicado:");
        return total;
    }
}
