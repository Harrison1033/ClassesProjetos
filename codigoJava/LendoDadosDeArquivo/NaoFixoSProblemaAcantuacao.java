package estudando.classe1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Sem problema com acentuação
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\aguia\\Desktop\\entrada.txt"))){
            String s = "";
            String line;
            while ((line = reader.readLine())!= null){
                s += line + "\n";
            }
            System.out.println(s);
            System.out.println(s.length());
        }
    }
}
