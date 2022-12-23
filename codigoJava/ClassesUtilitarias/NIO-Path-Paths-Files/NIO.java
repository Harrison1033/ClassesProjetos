package estudando.classe1;

import java.nio.file.Path;
import java.nio.file.Paths;
//NIO
public class Main{
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\modificação.txt");//Caminho absoluto
        System.out.println(p1.getFileName());
    }
}
