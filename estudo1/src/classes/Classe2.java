package classes;

public class Classe2 extends Classe1{
    protected double salario;
    static {
        System.out.println("Ficha Técnica (Bloco estático subclasse)");
    }
    {
        System.out.println("Dentro do Bloco de inicialização subclasse");
    }
    public Classe2(int idade, String nome, double altura, double salario) {
        super(idade, nome, altura);
        this.salario = salario;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Salário: " + salario);
    }
}
