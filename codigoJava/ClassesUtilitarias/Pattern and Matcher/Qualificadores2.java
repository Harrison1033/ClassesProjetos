package estudando.classe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Qualificadores 2
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
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotero@gmail.com, #@!zoro@mail.com.br, teste@gmail.com, sakura@mail";
        Pattern pattern = Pattern.compile(regex);//no caso do zoro foram ignorados os caracteres especiais
        Matcher matcher = pattern.matcher(texto);//no caso da sakura o email foi ignorado por não ter o .com
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {//Resulta em números Hexadecimais válidos
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}