package classes;
//Class User
public class Classe4 implements Classe5 {
    private String name;

    public Classe4(String name){
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Notificacao recebida: Novo produto adicionado - " + productName);
    }
}