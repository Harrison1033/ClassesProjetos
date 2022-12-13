package estudando.classe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Pattern e Matcher - meta caracteres

/**
 * \\d = todos os dígitos do texto
 * \\D = todos os caracteres que não são dígitos
 * \\s = espaços em branco(\t,\n,\f e \r)
 * \\S = todos os caracteres excluindo os espaços em branco
 * \\w = de a-z,A-Z,dígitos e _
 * \\W = o inverso do \w(Caracteres especiais e espaço)
 */
public class Main{
    public static void main(String[] args) {
        String regex = "\\d";
        String texto = "@h#h 212g vh_21 ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
