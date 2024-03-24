package teste;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Observer {
    void update(String productName);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Notificacao recebida: Novo produto adicionado - " + productName);
    }
}

interface CatalogObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String productName);
}

class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String productName) {
        for(Observer observer : observers)
            observer.update(productName);
    }

    public void addProduct(String name, String description, double price, String subscribeChoice) {
        if (subscribeChoice.equalsIgnoreCase("S"))
            notifyObservers(name);
        else
            System.out.println("Programa Encerrado.");
    }
}

public class Main1 {
    public static void main(String[] aargs) {
        Scanner scanner = new Scanner(System.in);

        Catalog catalog = new Catalog();
        User user = new User("Usuário 1");

        catalog.addObserver(user);
        System.out.println("Digite o Nome do Produto: ");
        String name = scanner.nextLine();
        System.out.println("Digite a marca do produto: ");
        String description = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        double price = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Gostaria de confirmar o pedido? ");
        String subscribeChoice = scanner.nextLine();

        scanner.close();

        catalog.addProduct(name, description, price, subscribeChoice);
    }
}