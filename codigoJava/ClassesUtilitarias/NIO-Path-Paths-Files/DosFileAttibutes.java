package estudando.classe1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
//DosFileAttibutes
public class Main{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\aguia\\Desktop\\teste.txt");
        if (Files.notExists(path))Files.createFile(path);

        Files.setAttribute(path,"dos:hidden",true);//Torna o arquivo oculto
        Files.setAttribute(path,"dos:readonly",true);

        Files.setAttribute(path,"dos:hidden",false);//Torna o aquivo visível
        Files.setAttribute(path,"dos:readonly",false);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path,DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());//Para saber se o arquivo é oculto
        System.out.println(dosFileAttributes.isReadOnly());
        //Alterar valores
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path,DosFileAttributeView.class);
        fileAttributeView.setHidden(true);//o true torna o arquivo oculto
        fileAttributeView.setReadOnly(true);
        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());
    }
}
