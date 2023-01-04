package estudando.classe1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//PathMatcherP2
class FindAllTestJovaOrClass extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{teste*}.{.java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class TerceiraClasse {
    public static void main(String[] args) throws IOException {
       Path root = Paths.get(".");
       Files.walkFileTree(root,new FindAllTestJovaOrClass());
    }
}
