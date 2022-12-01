package estudando.classe1;

import java.util.Calendar;
import java.util.Date;

//Calendar legado
public class Main{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        c.add(Calendar.DAY_OF_MONTH,3);//add somo dois dias
        c.roll(Calendar.HOUR,4);//roll somo 4 horas sem mudar o mês no calendário(o add pode mudar o mês)
        Date date = c.getTime();//Usado para imprimir a data na tela de forma simples
        System.out.println(date);
    }
}