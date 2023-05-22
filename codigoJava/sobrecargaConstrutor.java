package br.com.harrison.classe;

public class TesteUm {
    private final String name;
    private final int age;
    private final char sex;
    private double height;
    public TesteUm(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public TesteUm(String name, int age, char sex, double height) {
        this(name, age, sex ) ;
        this.height = height;
    }
    public void imprimir(){
        System.out.println("_____________________");
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Sex: " + this.sex);
        System.out.println("Height: " + this.height);
    }
}

--------------------------------------------------------------------------------------------
package br.com.harrison.principal;

import br.com.harrison.classe.TesteUm;

public class Main {
    public static void main(String[] args) {
        TesteUm testeUm = new TesteUm("Oligariato Teixeira", 42, 'M',1.82);
        TesteUm testeUm1 = new TesteUm("Ana Letícia Tícia", 37, 'F', 1.60);
        testeUm.imprimir();
        testeUm1.imprimir();

    }
}