package estudando.classe1;
//IO FileWriter
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {//Colocando o FileWriter dentro do try, ele fecha automaticamente
            fw.write("Un texto aleatório, sei lá:\nContinuando o texto daqui, rssss.");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
