package estudando.classe1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//SerializationB1
public class TerceiraClasse {
    public static void main(String[] args) {
        SegundaClasse aluno = new SegundaClasse(2L, "Harry Mustang", "123412121");
        serializar(aluno);
        deserializar();
    }

    private static void serializar(SegundaClasse aluno) {
        Path path = Paths.get("C:\\Users\\aguia\\Desktop\\pasta\\aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void deserializar(){
        Path path = Paths.get("C:\\Users\\aguia\\Desktop\\pasta\\aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            SegundaClasse aluno = (SegundaClasse) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
