package estudando.classe1;

import java.time.LocalDate;
import java.time.Month;

//LocalDate
public class Main{
    public static void main(String[] args){
        LocalDate agora = LocalDate.now();
        LocalDate date = LocalDate.of(1980, Month.JUNE,27);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date);
        System.out.println(agora);
    }
}