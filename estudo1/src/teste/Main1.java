package teste;

import java.util.InputMismatchException;
import java.util.Scanner;

//
public class Main1 {
    public static void main(String[] aargs) {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("Digite um número de 1 a 7");
        int numero = scan.nextInt();
      String[] nomes = new String[]{"João ", "Maria ", "Nícolas ", "Betty", "Walter ", "Joana "};
      for (int i = 0; i<nomes.length;i++){
          System.out.println("Matrícula: " + (i+1) + " Nome: " + nomes[i]);
      }
      switch (numero) {
          case 1 -> System.out.println("Domingo");
          case 2 -> System.out.println("Segunda");
          case 3 -> System.out.println("Terça");
          case 4 -> System.out.println("Quarta");
          case 5 -> System.out.println("Quinta");
          case 6 -> System.out.println("Sexta");
          case 7 -> System.out.println("Sábado");
          default -> System.out.println("Valor Inválido: ");
      }

      }catch (InputMismatchException e){
            System.out.println("Erro. Digite um número inteiro... ");
        }
    }
}