package teste;
//ClasseInternaIntroducao
public class MainUm {//Classe de fora
    private String nome = "Carmen Sandiego";

    class Inner {//Classe interna
        public void printMainUmAttribute() {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        MainUm mainUm = new MainUm();
        Inner inner = mainUm.new Inner();
        Inner inner1 = new MainUm().new Inner();//Faz o mesmo que o código acima
        inner.printMainUmAttribute();
        inner1.printMainUmAttribute();
    }
}