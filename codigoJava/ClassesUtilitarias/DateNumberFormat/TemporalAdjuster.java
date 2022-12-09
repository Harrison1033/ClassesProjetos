package estudando.classe1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**TemporalAdjuster
 * Nesta classe o dia que colocar ele dará o dia seguinte exceto se cair na sexta,sábado ou domingo
 * neste caso o programa automaticamente joga para segunda feira seguinte.
 */
class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek){
            case THURSDAY -> addDays = 4;
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
public class QuintaClasse  {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());//o número é o dia do calendário
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
