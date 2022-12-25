package estudando.classe1;

import java.nio.file.Path;
import java.nio.file.Paths;
//ResolvendoPaths
public class Main{
    public static void main(String[] args) {
        Path dir = Paths.get("home/harry");
        Path arquivo = Paths.get("dev/arqivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
        //caminho absoluto ex: /home/harry/dev/file.txt
        //caminho relativo ex: home/harry
        Path absoluto = Paths.get("/home/harry");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));
    }
}
