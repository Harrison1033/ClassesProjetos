package estudando.classe1;

import java.text.NumberFormat;
import java.util.Locale;
//Internacionalização Números e valores locale
public class Main{
    public static void main(String[] args){
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0]= NumberFormat.getCurrencyInstance();//Para moeda local
        nfa[1]= NumberFormat.getCurrencyInstance(localeJP);//Para moeda japonesa
        nfa[2]= NumberFormat.getInstance(localeUS);//formatação numérica norte americana
        nfa[3]= NumberFormat.getInstance(localeIT);//formatação numérica italiana
        double valor = 100_000.213;
        for (NumberFormat numberFormat:nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
