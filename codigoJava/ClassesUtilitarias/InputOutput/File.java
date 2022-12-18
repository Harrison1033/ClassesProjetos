package estudando.classe1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
//IO - Input Output - File
public class Main{
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            //file.createNewFile(); -->[Surround with try/catch]-->[Introduce local variable]
            boolean isCreated = file.createNewFile();//Cria um novo arquivo.txt
            System.out.println("Created: " + isCreated);//Mostra se realmente foi criado
            System.out.println("path: " + file.getPath());//Mostra a extenção do arquivo
            System.out.println("path absoluto: " + file.getAbsolutePath());//Mostra o caminho do arquivo
            System.out.println("is directory: " + file.isDirectory());//mostra se é um diretório
            System.out.println("is file: " + file.isFile());//Mostra se é um arquivo
            System.out.println("is hidden: " + file.isHidden());//Mostra se o arquivo é oculto
            System.out.println("Last Modified: " + new Date(file.lastModified()));//Mostra a data de modificação
            boolean exists = file.exists();//Deleta o arquivo setado caso ele exista
            if (exists){
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}