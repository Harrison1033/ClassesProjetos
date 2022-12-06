package estudando.classe1;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
//Duration
public class QuintaClasse  {//Baseado em segundos e nanosegundos
    public static void main(String[] args){//Não aceita LocalDate por não trabalhar com segundos
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now,nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow,timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(2000));
        Duration d4 = Duration.ofDays(20);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);//Resultado na duração de dias em horas(480)
    }
}
