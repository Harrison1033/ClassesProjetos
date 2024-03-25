package classes;

import java.util.ArrayList;
import java.util.List;


// Contexto que utiliza a estratégia
public class ShoppingCart {
    private List<Double> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addProduct (double price){
        products.add(price);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(){
        // TODO: Implementar a lógica de cálculo do total
        double total = 0d;
        for (Double product : products){
            total += product;
        }
        return discountStrategy.applyDiscount(total);// Retornar o total calculado
    }

}
