import java.text.DecimalFormat;
public class Main{
    public static void main(String[] args) {
     double d = 1145.4;

        DecimalFormat decimalFormat = new DecimalFormat("00000.000");
        String mask = decimalFormat.format(d);
        System.out.println(mask);

    }
}
