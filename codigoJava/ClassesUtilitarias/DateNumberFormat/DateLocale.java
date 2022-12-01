package estudando.classe1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
//Internacionalização de datas com locale
public class Main{
    public static void main(String[] args){
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suíça: " + df2.format(calendar.getTime()));
    }
}
