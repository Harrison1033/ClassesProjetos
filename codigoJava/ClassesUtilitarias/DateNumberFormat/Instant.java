package estudando.classe1;

import java.time.Instant;
import java.time.LocalDateTime;
//Instant
public class Main{//Trabalha com nanosegundos e o Date com milisegundos
    public static void main(String[] args){
        Instant now = Instant.now();
        System.out.println(now);//O tempo termina com a letra Z(Melhor opção para banco de dados)
        System.out.println(LocalDateTime.now());
    }
}
