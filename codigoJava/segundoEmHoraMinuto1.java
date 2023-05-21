package br.com.harrison.principal;

import java.util.Scanner;
//convertendo seconds em horas minutos e seconds
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int seconds = scan.nextInt();

        int qtdHours = seconds / 3600;
        seconds %= 3600;
        int qtdMinuts = seconds / 60;
        seconds %= 60;
        int qtdSeconds = seconds;

        System.out.printf("%d:%d:%d%n", qtdHours, qtdMinuts, qtdSeconds);

    }
}