package estudando.classe1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
//ZipOutputStream
public class Main{
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("C:\\Users\\aguia\\Desktop\\pasta\\arquivo.zip");
        Path arquivosParaZipar = Paths.get("C:\\Users\\aguia\\Desktop\\pasta\\subpasta\\subsubpasta");
        zip(arquivoZip,arquivosParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivoParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)){
                for (Path file : directoryStream) {
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                    zipStream.putNextEntry(zipEntry);
                    Files.copy(file, zipStream);//Copia o conteúdo dos arquivos.
                    zipStream.closeEntry();
                }
            System.out.println("arquivo criado com sucesso: ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}