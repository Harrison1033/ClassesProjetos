package classes;

import java.util.ArrayList;
import java.util.List;

//Classe Implements
public class Classe3 {
    public static final List<Classe4>usuarios = new ArrayList<>();
    //FIXME: implementa o padrão Singleton para garantir que haja apanas uma instância do gerenciador de usuários
    public static void addUsuario(String name){
        usuarios.add(new Classe4(usuarios.size() + 1,name));
    }
    //FIXME: Implementa a impressão de usuários
    public static void listUsuarios(){
        for (Classe4 usuario:usuarios){
            System.out.println(usuario.getNome());
        }
    }

}
