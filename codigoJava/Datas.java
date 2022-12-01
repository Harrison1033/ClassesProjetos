package estudando.classeMain;
//Manipulando Datas
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainClasse2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,5,7,15,45,0);//inserindo data prédefinida
        calendar.add(Calendar.YEAR,1);//Adicionando um ano na data
        calendar.add(Calendar.MINUTE,-30);//subtraindo 30 minutos do calendário.
        //Observação: Neste caso os meses comoção a contar no zero 0.

        Date date = calendar.getTime();
        System.out.println(date);
        //Data na forma curta
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.SHORT);
        String f1 = dateFormat1.format(date);
        System.out.println(f1);//07/06/2022
        //Data na forma média
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String f2 = dateFormat2.format(date);
        System.out.println(f2);//7 de jun. de 2022
        //Data na forma longa
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG);
        String f3 = dateFormat3.format(date);
        System.out.println(f3);//7 de junho de 2022
        //Data na forma norte americana
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.LONG,new Locale("en","US"));
        String f4 = dateFormat4.format(date);
        System.out.println(f4);//June 7, 2022
        //Data no formato personalizado
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("dd-MM-yyyy");
        String f5 = dateFormat5.format(date);
        System.out.println(f5);//07-06-2022
        //Transformando String em Date
        String sd1 = "2030-07-01";
        SimpleDateFormat dateFormat6 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = dateFormat6.parse(sd1);
            System.out.println(date1);//Mon Jul 01 00:00:00 BRT 2030
        }catch (ParseException exception){//Parse é o inverso do format( de Stringo para Date)
            exception.printStackTrace();
        }

    }
}
