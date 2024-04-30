package teste;

import java.util.Scanner;


public class Main1 {
    public static void main(String[] aargs) {
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Digite o primeiro númro: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();
        Teste teste = new Teste();
        System.out.println(" = "  + teste.multiplicaDoisNumeros(n1,n2));
    }
    public static class Teste{
        public int multiplicaDoisNumeros(int numero1, int numero2){
            System.out.print(numero1 + " X " + numero2);
            return numero1 * numero2;
        }
    }
}