package estudando.classe1;

public class VarArgs {
    public static void imprime(String...textos) {
	
        for (String texto : textos) {
            System.out.print(texto + ", ");
        }
    }
}