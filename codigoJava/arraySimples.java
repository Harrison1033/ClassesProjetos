package bk.com.harrison.principal;
import java.util.Scanner;

public class PrincipalTeste {
    public static void main(String[] args) {
        //Arrays de tamanho n que imprime tudo no final
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of names: ");
        num = Integer.parseInt(scan.nextLine());//Só deu certo com o Integer.parseInt
        String[] name = new String[num];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter the name");
            name[i] = scan.nextLine();
        }
        for (String s : name) {
            System.out.println("Name: " + s);
        }
    }
}