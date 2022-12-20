package estudando.classe1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//BufferedWriter
public class Main{//Usado para melhor performance
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Um grande texto qualquer");
            bw.newLine();//para substituir o \n pois nem todos os SOs são compatíveis
            bw.flush();//para finalizar toda a operação do texto
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
