package estudando.classe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

//BasicFileAttributes2
public class Main{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\harry\\Desktop\\entrada.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime createonTime = basicFileAttributes.creationTime();
        FileTime lastMidifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime " + createonTime);
        System.out.println("LastMidifiedTime " + lastMidifiedTime);
        System.out.println("LastAccessTime " + lastAccessTime);

        //Para alterar o acesso
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastMidifiedTime, newCreationTime, createonTime);

        createonTime = fileAttributeView.readAttributes().creationTime();
        lastMidifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("CreationTime " + createonTime);
        System.out.println("LastModifiedTime " + lastMidifiedTime);
        System.out.println("LastAccessTime " + lastAccessTime);
    }
}
