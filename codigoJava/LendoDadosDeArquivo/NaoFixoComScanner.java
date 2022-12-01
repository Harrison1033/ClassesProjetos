package estudando.classe1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//Não fixo com scanner (melhor opção)
public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\aguia\\Desktop\\entrada.txt"))){
            String s = "";
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                s += line + "\n";
            }
            System.out.println(s);
            System.out.println(s.length());
        }
    }
}