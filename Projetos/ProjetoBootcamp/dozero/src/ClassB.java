import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassB {
    public void imprimir() {
        String frase = JOptionPane.showInputDialog("Entre com uma frase:");
        try {
            FileWriter file = new FileWriter("D:/temp/arquivo.txt", true);//cria um arquivo na pasta temp se não houver
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo: ");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta D:/temp existe:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
