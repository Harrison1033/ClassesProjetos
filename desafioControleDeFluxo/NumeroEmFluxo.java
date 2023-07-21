package teste;

import java.util.Scanner;

public class NumeroEmFluxo {
    Scanner scan = new Scanner(System.in);
    private int num1;
    private int num2;
    public void conta(){
        System.out.println("Digite um número:");
        num1 = scan.nextInt();
        System.out.println("Digite outro número:");
        num2 = scan.nextInt();

    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
