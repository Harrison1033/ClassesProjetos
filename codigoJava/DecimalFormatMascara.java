import java.text.DecimalFormat;

public class MainClasse2 {
    public static void main(String[] args) {
     double d = 1145.4;

        DecimalFormat decimalFormat = new DecimalFormat("00000.000");
        String mascara = decimalFormat.format(d);
        System.out.println(mascara);

    }
}
