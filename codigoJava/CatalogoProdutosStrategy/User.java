package classes;
//Class User
public class User implements Observer {
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Notificacao recebida: Novo produto adicionado - " + productName);
    }
}