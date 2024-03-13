package com.exemploapi.testando.repository;

import com.exemploapi.testando.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getId()==null)
            System.out.println("SAVE - Recebendo usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para a camada de repositório",id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os Usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Harry","password"));
        usuarios.add(new Usuario("Kelly","mastepass"));
        usuarios.add(new Usuario("Helio","micael"));
        usuarios.add(new Usuario("Emília","minipass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para ler",id));
        return new Usuario("Harry","password");
    }
    public Usuario findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o username",username));
        return new Usuario("Harry","password");
    }
}
