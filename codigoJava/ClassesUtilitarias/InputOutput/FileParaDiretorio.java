package estudando.classe1;

import java.io.File;
import java.io.IOException;
        //File para Diretório
public class Main{
    public static void main(String[] args) throws IOException {
        //Cria Diretório
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        //Cria um arquivo dentro do diretório
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        //Renomeia o arquivo dentro do diretório
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);
        //Renomeia o Diretório
        File diretorioRenomeado = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenomeado);
        System.out.println(isDiretorioRenomeado);
    }
}