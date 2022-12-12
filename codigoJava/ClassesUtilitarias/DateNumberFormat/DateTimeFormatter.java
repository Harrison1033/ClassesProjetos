package estudando.classe1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//DateTimeFormatter
public class Main{
    public static void main(String[] args){
        LocalDate date = LocalDate.now();//Formatter transforma data para String
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210219",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);//Parse transforma String para data
        System.out.println(parse2);
        System.out.println(parse3);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/02/2021",formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("19.Februar.2021",formatterGR);
        System.out.println(parseGR);
    }
}
