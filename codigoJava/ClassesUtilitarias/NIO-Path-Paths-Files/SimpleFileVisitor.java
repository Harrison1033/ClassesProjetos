package estudando.classe1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//SimpleFileVisitor
class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class TerceiraClasse {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("D:\\");
        Files.walkFileTree(root,new ListAllFiles());
    }
}
