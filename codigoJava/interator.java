package br.com.harrison.classe;
//Utilizando o interator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // vamos criar uma ArrayList
        ArrayList<String> people = new ArrayList();
		//vamos digitar o numero de interações
        System.out.println("Enter the number of names to be entered: ");
        int vez = scan.nextInt();
        //vamos digitar os nomes pelo número de interações
        for (int i = 0; i < vez; i ++) {
            System.out.println("Enter a name: ");
            people.add(scan.next());
        }
        // vamos obter um iterador para a lista
        Iterator<String> person = people.iterator();

        // vamos obter o próximo elemento (neste caso, do primeiro ao quarto)
        for (int i = 0; i < vez; i ++) {
            String nome = person.next();
            System.out.println("Name " + (i +1) + " : " + nome);
        }
    }
}