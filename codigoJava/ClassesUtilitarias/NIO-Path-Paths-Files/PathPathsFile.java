package estudando.classe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//PathPathsFile
public class Main1{
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");//Cria um diretório
        if (Files.notExists(pastaPath)){//Caso exista ele não permite lançar uma exceção
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");//Cria subpastas

        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");//Cria arquivo na subpasta
        if (Files.notExists(filePath)){//Caso exista o arquivo não permitirá lançar ezceção
            Path filePathCreated = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
