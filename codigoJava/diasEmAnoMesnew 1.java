package br.com.harrison.principal;

import java.util.Scanner;
//convertendo days em years, monthes e days
public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age in days:");
        int day = scan.nextInt();
        int year = day / 365;
        day %= 365;
        int month = day / 30;
        day %= 30;
        int days = day;

        System.out.println(year + " Year(s)\n" + month + " Month(es)\n" + days + " day(s)");

    }
}