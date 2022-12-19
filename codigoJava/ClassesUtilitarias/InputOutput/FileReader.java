package estudando.classe1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//FileReader
public class Main{
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
            int i ;
            while ((i = fr.read())!= -1){//no final do texto ele dá o valor -1
                System.out.print((char) i);//print sem o ln e o (char) como um cash
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}