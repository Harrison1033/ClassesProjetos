package estudando.classe1;
//Scanner Tokens e Delimitadores
//Neste caso o texto só mostrará os resultados como strings somente
public class Main{
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        String[] nomes = texto.split(",");//Delimitador (,)
        for (String nome : nomes) {
            System.out.println(nome.trim());

        }
    }
}