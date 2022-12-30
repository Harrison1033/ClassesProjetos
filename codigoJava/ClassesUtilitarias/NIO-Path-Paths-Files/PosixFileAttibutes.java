package estudando.classe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Set;

//PosixFileAttibutes para linux
public class Main{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/aguia/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path,PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());
        //Alterar permissões
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path,PosixFileAttributeView.class);
        Set<PosixFilePermission>posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions());
    }
}
