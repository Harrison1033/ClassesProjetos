package estudando.classe1;

import java.nio.file.Path;
import java.nio.file.Paths;
//Relativize
public class Main{
    public static void main(String[] args) {
        Path dir = Paths.get("home/aguia");
        Path calzz = Paths.get("home/aguia/Desktop/entrada.txt");
        Path pathToCalzz = dir.relativize(calzz);
        System.out.println(pathToCalzz);

        Path absoluto1 = Paths.get("home/aguia");
        Path absoluto2 = Paths.get("usr/local");
        Path absoluto3 = Paths.get("home/aguia/Desktop/entrada.txt");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20211921");

        System.out.println("1 "+ absoluto1.relativize(absoluto3));
        System.out.println("2 "+ absoluto3.relativize(absoluto1));
        System.out.println("3 "+ absoluto1.relativize(absoluto2));
        System.out.println("4 "+ absoluto1.relativize(relativo2));
        System.out.println("5 " + absoluto1.relativize(relativo1));

    }
}
