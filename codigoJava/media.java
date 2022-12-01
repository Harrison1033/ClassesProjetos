//Nota e Média usando o for

package br.com.harrison.classe;

import java.util.Scanner;

public class TesteQuatro {
    Scanner scan = new Scanner(System.in);
    public double nota;
    public double incremento;
    public  double media;

    public void imprimir(){
        for (int i = 0; i < 3; i++){
            System.out.println("Digite a nota " + (i + 1));
            nota = scan.nextDouble();
            incremento += nota;
        }
        media = incremento / 3;
        System.out.print("Nota: ");
        System.out.printf("%.2f", media);
        if (media >= 0 && media < 5){
            System.out.println("\nREPROVADO:");
        }else if (media >= 5 && media < 6){
            System.out.println("\nRECUPERAÇÃO");
        }else if (media >= 6 && media <= 10 ){
            System.out.println("\nAPROVADO, PARABÉNS:");
        }else {
            System.out.println("\nNota Inválida:");
        }
    }
}