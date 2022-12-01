package estudando.classe1;

public class Main  {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Geraldo",2457);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcos",1988);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}