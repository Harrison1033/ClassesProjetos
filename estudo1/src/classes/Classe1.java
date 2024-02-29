package classes;
public class Classe1 {
    protected int idade;
    protected String nome;
    protected double altura;

    public Classe1(int idade, String nome, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }
    public void imprimir(){
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
    }
}
