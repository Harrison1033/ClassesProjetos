package estudando.classe1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat
public class Main{
    public static void main(String[] args){
    String data = "'Fortaleza 'dd' de' MMMM 'de' yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(data);
        System.out.println(sdf.format(new Date()));
    }
}