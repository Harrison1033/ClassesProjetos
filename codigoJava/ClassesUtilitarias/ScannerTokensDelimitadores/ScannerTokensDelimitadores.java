package estudando.classe1;

import java.util.Scanner;
//Scanner Tokens e Delimitadores
public class Main{//Neste caso o número é mostrado como inteiro e o true como boolean
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            }else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
