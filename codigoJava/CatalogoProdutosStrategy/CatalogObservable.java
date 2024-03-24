package classes;

public interface CatalogObservable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String productName);
}