package classes;
//CatalogObservable
public interface Classe3 {
    void addObserver(Classe5 classe5);
    void removeObserver(Classe5 classe5);
    void notifyObserver(String productName);
}
