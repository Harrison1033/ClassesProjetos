CatalogObservable
package classes;

import java.util.ArrayList;
import java.util.List;

//Catalog
public class Catalog implements CatalogObservable {
    private List<Observer>observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String productName) {
        for (Observer observer: observers){
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
