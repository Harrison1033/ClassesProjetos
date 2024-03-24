package classes;

import java.util.ArrayList;
import java.util.List;

//Classe Implements
public class Implementa {
    public static final List<User>usuarios = new ArrayList<>();
    //FIXME: implementa o padrão Singleton para garantir que haja apanas uma instância do gerenciador de usuários
    public static void addUsuario(String name){
        usuarios.add(new User(usuarios.size() + 1,name));
    }
    //FIXME: Implementa a impressão de usuários
    public static void listUsuarios(){
        for (User usuario:usuarios){
            System.out.println(usuario.getNome());
        }
    }

}
