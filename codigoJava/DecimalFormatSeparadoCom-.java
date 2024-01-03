package estudando.classeMain;
//Decimal Format(Separado com o '-')
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainClasse2 {
    public static void main(String[] args) {
     double d = 1145.4;

        DecimalFormat decimalFormat = new DecimalFormat("00000.000");
        decimalFormat.setGroupingUsed(true);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols( );
        decimalFormatSymbols.setDecimalSeparator('-');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String mask = decimalFormat.format(d);
        System.out.println(mask);

    }
}