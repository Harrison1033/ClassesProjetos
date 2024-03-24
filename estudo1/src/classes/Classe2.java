package classes;

import java.util.ArrayList;
import java.util.List;

//Catalog
public class Classe2 implements Classe3 {
    private List<Classe5>observers = new ArrayList<>();

    @Override
    public void addObserver(Classe5 classe5) {
        observers.add(classe5);
    }

    @Override
    public void removeObserver(Classe5 classe5) {
        observers.remove(classe5);
    }

    @Override
    public void notifyObserver(String productName) {
        for (Classe5 observer: observers){
            observer.update(productName);
        }

    }
    public void addProduct(String name, String description, double price, String subscribeChoice ){
        if (subscribeChoice.equalsIgnoreCase("S")){
            notifyObserver(name);
        }else {
            System.out.println("Programa Encerrado.");
        }
    }
}
