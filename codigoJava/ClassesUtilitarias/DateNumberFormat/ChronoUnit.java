package estudando.classe1;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

//ChronoUnit
public class Main{
    public static void main(String[] args){
        LocalDateTime aniversario = LocalDateTime.of(1980, Month.JUNE,27,17,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dias: " + ChronoUnit.DAYS.between(aniversario,now));
        System.out.println("Semanas: " + ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println("Meses: " + ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println("Anos: " + ChronoUnit.YEARS.between(aniversario,now));
    }
}
