package estudando.classe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Qualificadores 1
\\d = todos os dígitos do texto
\\D = todos os caracteres que não são dígitos
\\s = espaços em branco(\t,\n,\f e \r)
\\S = todos os caracteres excluindo os espaços em branco
\\w = de a-z,A-Z,dígitos e _
\\W = o inverso do \w(Caracteres especiais e espaço)
"[]" = mostra o que for colocado dentro dos colchetes
? = Zero ou uma ocorrência
* = Zero ou mais ocorrências
+ = Uma ou mais ocorrências
{n,m} = de n até m
() =
| = ou
$ = Final de linha
. = 1.3 tudo entre 1 e 3 são considerados
\\. = é o ponto de texto
 */
public class Main{
    public static void main(String[] args) {
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";//O sinal de + diz que a expressão pode se repetir 1 ou mais vezes
        String texto = "12 0x 0X2 0xFFABC 0x9f 0x1 ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {//Resulta em números Hexadecimais válidos
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
