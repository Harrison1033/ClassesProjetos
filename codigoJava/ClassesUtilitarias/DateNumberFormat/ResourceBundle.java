package estudando.classe1;
/*ResourceBundle
 * clicando na pasta src clique em file e crie um arquivo com qulaquer nome seguido da língua e localização
 * coloque a extenção .properties e dê um enter(ex: mensagem_pt_BR.properties e mensagem_en_US.properties)
 * depois de criar os dois arquivos ou mais, escreva neles as chaves e seus valores separados pela igualdade
 * exemplo: (hello = Olá)(good.morning = Bom dia)||(hello = Hello)(good.morning = Good morning) sem parênteses
 * em seguida é só seguir o código abaixo(Esta é uma forma manual de traduzir o que vc precisar por chamadas)
 */

import java.util.Locale;
import java.util.ResourceBundle;

public class Main{
    public static void main(String[] args){
        //System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem",new Locale("pt","BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        bundle = ResourceBundle.getBundle("mensagem",new Locale("en","US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }
}
