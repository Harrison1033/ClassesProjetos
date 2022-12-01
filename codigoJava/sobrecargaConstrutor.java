package br.com.harrison.classe;

public class TesteUm {
    private final String nome;
    private final int idade;
    private final char sexo;
    private double altura;
    public TesteUm(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public TesteUm(String nome, int idade, char sexo, double altura) {
        this(nome, idade, sexo ) ;
        this.altura = altura;
    }
    public void imprimir(){
        System.out.println("_____________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Altura: " + this.altura);
    }
}

--------------------------------------------------------------------------------------------
package br.com.harrison.principal;

import br.com.harrison.classe.TesteUm;

public class TesteMain01 {
    public static void main(String[] args) {
        TesteUm testeUm = new TesteUm("Harrison de Oliveira", 42, 'M',1.82);
        TesteUm testeUm1 = new TesteUm("Keliane de Lima", 37, 'F', 1.60);
        testeUm.imprimir();
        testeUm1.imprimir();

    }
}