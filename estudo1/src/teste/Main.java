package teste;
//momodify09
/**
 * Programa Destinado para rever temas já aprendidos
 * em cada classe terá uma descrição do que ela represnta
 * toda vez que o programa mudar, as descrições também devem mudar
 * por enquanto, eles estarão disponíveis no meu github para testar meu conhecimento git
 * ao final, espero está preparado para um projeto bem complexo
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import classes.Classe1;
//import classes.Classe2;
//import classes.Classe3;
//import classes.Classe4;


class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    private static final List<User> users = new ArrayList<>();

    // TODO: Implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários

    public static void addUser(String name) {

        // TODO("Implementar a lógica de adicionar um novo usuário na lista mutável $users.")
        users.add(new User(users.size() + 1, name));
    }

    public static void listUsers() {

        // TODO("Implementar a impressão dos $users, seguindo o padrão definido no enunciado.")
        for (User user : users) {
            System.out.println(user.getName());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após a leitura do número
       
        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            addUser(i + " - " + name);
        }

        listUsers();

    }
}
