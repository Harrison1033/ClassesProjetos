package teste;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] aargs) {

        Teste teste = new Teste();
        System.out.println(" = "  + teste.multiplicaDoisNumeros());
    }
    public static class Teste{
        public int multiplicaDoisNumeros(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o primeiro númro: ");
            Integer numero1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            Integer numero2 = scan.nextInt();
            System.out.print(numero1 + " X " + numero2);
            return numero1 * numero2;

        }
    }
}