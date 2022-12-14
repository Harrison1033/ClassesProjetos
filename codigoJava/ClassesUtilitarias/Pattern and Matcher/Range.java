package estudando.classe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Range
"[]" = mostra o que for colocado dentro dos colchetes
? = Zero ou uma ocorrência
* = Zero ou mais ocorrências
+ = Uma ou mais ocorrências 
{n,m} = de n até m
() = 
| = ou
$ = Final de linha
 */
public class Main{
    public static void main(String[] args) {
        String regex = "[a-hA-I]";//se colocar espaço ele também procurará os espaços;
        String texto = "@h#h 212g vh_21 ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int numeroHexadecimal = 0X59F86A;//Para digitar um número HexaDecimal precisa colocar o 0X na frente
        System.out.println(numeroHexadecimal);//O reslultado será o número inteiro
    }
}
