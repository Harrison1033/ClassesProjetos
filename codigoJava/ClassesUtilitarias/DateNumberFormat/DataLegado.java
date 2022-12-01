package estudando.classe1;
//Date legado
import java.util.Date;

public class Main{
    public static void main(String[] args){
        Date date = new Date(1613061109953L);
        date.setTime(date.getTime() - 3_600_000);
        System.out.println(date);
    }
}
