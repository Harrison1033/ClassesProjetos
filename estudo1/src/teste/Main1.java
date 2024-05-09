package teste;

import java.util.InputMismatchException;
import java.util.Scanner;

//
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
        System.out.println("Entrando no método B");
        c();
        System.out.println("Finalizando o método B");
    }
    static void c(){
        System.out.println("Entrando no método C");
        System.out.println("Finalizando o métoso C");
    }
}