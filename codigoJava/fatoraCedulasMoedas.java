package br.com.harrison.principal;
import java.util.Scanner;
//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule
// o menor número de notes e coins possíveis no qual o valor pode ser decomposto. As notes consideradas são de 100, 50,
// 20, 10, 5, 2. As coins possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notes
// necessárias.
//   Entrada
//   O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//   Saída
//   Imprima a quantidade mínima de notes e coins necessárias para trocar o valor inicial, conforme exemplo fornecido.
	public classe main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble(); 
        int round;
        System.out.println("NOTES:" );
        round = (int)money/100;
        System.out.printf("%d note(s) de R$ 100.00%n",round);
        money %=  100;

        round = (int)money/50;
        System.out.printf("%d note(s) de R$ 50.00%n",round);
        money %=  50;

        round = (int)money/20;
        System.out.printf("%d note(s) de R$ 20.00%n",round);
        money %=  20;

        round = (int)money/10;
        System.out.printf("%d note(s) de R$ 10.00%n",round);
        money %=  10;

        round = (int)money/5;
        System.out.printf("%d note(s) de R$ 5.00%n",round);
        money %=  5;

        round = (int)money/2;
        System.out.printf("%d note(s) de R$ 2.00%n",round);
        money %=  2;

        money = money * 100.0; //multipliqueir por 100 para nao trabalhar com casas decimais que no caso achei muito complicado
        System.out.println("COINS:");
        round = (int) (money / 100);
        System.out.printf("%d coin(s) de R$ 1.00%n",round);
        money %=  100;

        round = (int) (money/50);
        System.out.printf("%d coin(s) de R$ 0.50%n",round);
        money %=  50;

        round = (int) (money/25);
        System.out.printf("%d coin(s) de R$ 0.25%n",round);
        money %=  25;

        round = (int) (money/10);
        System.out.printf("%d coin(s) de R$ 0.10%n",round);
        money %=  10;

        round = (int) (money/5);
        System.out.printf("%d coin(s) de R$ 0.05%n",round);
        money %=  5;

        round = (int) (money);
        System.out.printf("%d coin(s) de R$ 0.01%n", round) ;

    }
}