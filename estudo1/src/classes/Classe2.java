package classes;

import java.util.ArrayList;
import java.util.List;

//ShoppingCart
// Contexto que utiliza a estratégia
public class Classe2  {
    private List<Double> products = new ArrayList<>();
    private Classe5 discountStrategy;

    public void addProduct (double price){
        products.add(price);
    }

    public void setDiscountStrategy(Classe5 discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(){
        // TODO: Implementar a lógica de cálculo do total
        double total = 0d;
        for (Double product:products){
            total += product;
        }
        return discountStrategy.applyDiscount(total);// Retornar o total calculado
    }

}
