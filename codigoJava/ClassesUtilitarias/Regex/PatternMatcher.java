package estudando.classe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern e Matcher
public class Main{
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaababeterraba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições Encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");//resultados e posições
        }
    }
}
