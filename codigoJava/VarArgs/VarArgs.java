package estudando.classe1;

public class VarArgs {
    public static void prints(String...texts) {
	
        for (String text : texts) {
            System.out.print(text + ", ");
        }
    }
}