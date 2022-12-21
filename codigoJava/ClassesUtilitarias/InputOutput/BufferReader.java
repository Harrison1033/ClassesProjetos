package estudando.classe1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader
public class Main{
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){
            String linha;
            while ((linha = br.readLine())!= null){//no final do texto ele dá o valor null
                System.out.print(linha);//print sem o ln e o (char) como um cash
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
