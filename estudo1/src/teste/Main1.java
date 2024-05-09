package teste;

import java.util.InputMismatchException;
import java.util.Scanner;
//Métodos intrelassados
public class Main1 {
    public static void main(String[] aargs) {
        System.out.println("Entrando no método Main");
        a();
        System.out.println("Finalizando o método main");
    }
    static void a(){
        System.out.println("Entrando no método A");
        for (int i = 0; i < 5; i++) System.out.print(i + ", ");
        b();
        System.out.println("Finalizando o método A");
    }
    static void b(){
        System.out.println("\nEntrando no método B");
        int i = 2 * 3;
        System.out.println("Resultado: " + i);
        c();
        System.out.println("Finalizando o método B");
    }
    static void c(){
        System.out.println("Entrando no método C");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Digite um número: ");
            int num1 = scan.nextInt();
            System.out.println("Digite ouro número:");
            int num2 = scan.nextInt();
            System.out.println(num1 * num2);
        }catch (InputMismatchException e){
            System.out.println("Erro. Digite um número inteiro -> " + e);
        }finally {
            System.out.println("Continuando o processamento:");
        }
        System.out.println("Finalizando o métoso C");
    }
}