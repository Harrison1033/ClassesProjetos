package estudando.classe1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//DirectorStream
public class TerceiraClasse {
    public static void main(String[] args) {
        Path dir = Paths.get("D:\\");//Lista os diretórios do caminho especificado(não lista subDiretórios)
       try (DirectoryStream<Path>stream = Files.newDirectoryStream(dir)){
           for (Path path: stream){
               System.out.println(path.getFileName());
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
