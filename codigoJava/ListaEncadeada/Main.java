package teste;

public class ClasseNove {
    public static void main(String[] args) {
   ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

   minhaListaEncadeada.add("Teste 1");
   minhaListaEncadeada.add("Teste 2");
   minhaListaEncadeada.add("Teste 3");
   minhaListaEncadeada.add("Teste 4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.romove(3));

        System.out.println(minhaListaEncadeada);
    }

}
