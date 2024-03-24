package classes;
//Classe User

class User {
    private final int id;
    private final String nome;

    public User(int id,String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}