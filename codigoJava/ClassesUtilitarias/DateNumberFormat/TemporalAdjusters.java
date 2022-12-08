package estudando.classe1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

//TemporalAdjusters
public class Main{
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH,9);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());//Mostra a próxima Quarta da quarta atual

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());//Mostra a Quarta anterior à quarta atual

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());//primeiro dia do mês

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());//ultimo dia do mês

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());//primeiro dia do próximo ano
    }
}
