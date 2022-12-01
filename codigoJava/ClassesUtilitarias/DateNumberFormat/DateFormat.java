package estudando.classe1;

import java.text.DateFormat;
import java.util.Calendar;

//DateFormat

public class Main{
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];//Posso usar o new aqui por fazer do DateFormat um array
        df[0]= DateFormat.getInstance();
        df[1]= DateFormat.getDateInstance();
        df[2]= DateFormat.getDateTimeInstance();
        df[3]= DateFormat.getDateInstance(DateFormat.SHORT);
        df[4]= DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5]= DateFormat.getDateInstance(DateFormat.LONG);
        df[6]= DateFormat.getDateInstance(DateFormat.FULL);
        for (DateFormat dateFormat:df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}